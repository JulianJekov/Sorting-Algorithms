import java.time.LocalTime;
import java.util.Random;
public class BubbleSort {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        System.out.println("Before sorting " + LocalTime.now());

//        printNumbers(numbers);

        bubbleSort(numbers);

//        printNumbers(numbers);

        System.out.println("\nAfter sorting " + LocalTime.now());

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
