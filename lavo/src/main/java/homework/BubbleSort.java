package homework;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 76, 54, 47, 88, 64, 26, 59, 97, 71, 9, 97, 8, 79, 20, 77, 83, 65, 62, 76, 65, 92, 80, 36, 33,
                59, 40, 96, 90, 94, 10, 38, 16, 52, 26, 35, 100, 53, 98, 19, 50, 62, 59, 74, 36, 10, 96, 89, 38, 76,
                63 };

        System.out.println("Original array: ");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted array: ");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no elements were swapped in the inner loop, then the array is already
            // sorted
            if (!swapped)
                break;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
