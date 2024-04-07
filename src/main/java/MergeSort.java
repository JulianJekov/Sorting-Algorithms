import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[100000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        long startTime = System.currentTimeMillis();
        System.out.println("Before sorting");
        printNumbers(numbers);

        mergeSort(numbers);

        long endTime = System.currentTimeMillis();
        System.out.println("\nAfter sorting");
        printNumbers(numbers);
        System.out.printf("\nTotal: %d ms", endTime - startTime);
    }

    private static void mergeSort(int[] numbers) {

        int numbersLength = numbers.length;

        if (numbersLength < 2) {
            return;
        }

        int midIndex = numbersLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[numbersLength - midIndex];

        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = numbers[i];
        }

        for (int i = midIndex; i < numbersLength; i++) {
            rightHalf[i - midIndex] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(numbers, leftHalf, rightHalf);
    }

    private static void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;

        int leftIndex = 0;
        int rightIndex = 0;
        int numbersIndex = 0;

        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (leftHalf[leftIndex] <= rightHalf[rightIndex]) {
                numbers[numbersIndex] = leftHalf[leftIndex];
                leftIndex++;
            } else {
                numbers[numbersIndex] = rightHalf[rightIndex];
                rightIndex++;
            }
            numbersIndex++;
        }

        while (leftIndex < leftLength) {
            numbers[numbersIndex] = leftHalf[leftIndex];
            leftIndex++;
            numbersIndex++;
        }

        while (rightIndex < rightLength) {
            numbers[numbersIndex] = rightHalf[rightIndex];
            rightIndex++;
            numbersIndex++;
        }
    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
