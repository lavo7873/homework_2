package homework;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 97, 72, 97, 49, 76, 88, 97, 9, 100, 57, 35, 73, 18, 85, 33, 49, 94, 72, 74, 22, 8, 21, 61, 34,
                75, 54, 43, 26, 28, 79, 60, 10, 4, 63, 48, 89, 83, 18, 45, 51, 93, 17, 84, 47, 20, 9, 32, 96, 82, 70 };

        System.out.println("Original array: ");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted array: ");
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
