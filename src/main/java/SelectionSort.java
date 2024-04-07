import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        long startTime = System.currentTimeMillis();
        System.out.println("Before sorting");
        printNumbers(numbers);

        selectionSort(numbers);

        long endTime = System.currentTimeMillis();
        System.out.println("\nAfter sorting");
        printNumbers(numbers);
        System.out.printf("\nTotal: %d ms", endTime - startTime);
    }

    private static void selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int minNumber = numbers[i];
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < minNumber) {
                    minNumber = numbers[j];
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = minNumber;
            numbers[minIndex] = temp;
        }
    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
