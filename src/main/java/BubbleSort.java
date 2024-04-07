import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        long startTime = System.currentTimeMillis();
        System.out.println("Before sorting");
        printNumbers(numbers);

        bubbleSort(numbers);

        long endTime = System.currentTimeMillis();
        System.out.println("\nAfter sorting");
        printNumbers(numbers);
        System.out.printf("\nTotal: %d ms", endTime - startTime);
    }

    private static void bubbleSort(int[] numbers) {

        boolean swapped = true;
        while (swapped) {
            swapped = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
