import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        int[] numbers = new int[100000];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        long startTime = System.currentTimeMillis();
        System.out.println("Before sorting");
//        printNumbers(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        long endTime = System.currentTimeMillis();
        System.out.println("\nAfter sorting");
//        printNumbers(numbers);
        System.out.printf("\nTotal time to sort: %d ms", endTime - startTime);
    }

    private static void quickSort(int[] numbers, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = numbers[pivotIndex];
        swap(numbers, pivotIndex, highIndex)
        ;

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }


            swap(numbers, leftPointer, rightPointer);
        }

        swap(numbers, leftPointer, highIndex);

        quickSort(numbers, lowIndex, leftPointer - 1);
        quickSort(numbers, leftPointer + 1, highIndex);
    }

    private static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
