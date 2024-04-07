import java.time.LocalTime;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before sorting " + LocalTime.now());

        printNumbers(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter sorting " + LocalTime.now());

        printNumbers(numbers);
    }

    private static void insertionSort(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];

            int j = i - 1;
            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = temp;
        }

    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
