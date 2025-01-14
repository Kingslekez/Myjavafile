import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {
        // Sample array
        int[] array = {5, 2, 8, 1, 3, 6, 8, 88};
        
        System.out.println("Original Array: " + Arrays.toString(array));

        // Sort using built-in method
        int[] arrayUsingBuiltIn = array.clone();
        Arrays.sort(arrayUsingBuiltIn);
        System.out.println("Sorted Array (Using Built-in Method): " + Arrays.toString(arrayUsingBuiltIn));

        // Sort using Bubble Sort
        int[] arrayUsingBubbleSort = array.clone();
        bubbleSort(arrayUsingBubbleSort);
        System.out.println("Sorted Array (Using Bubble Sort): " + Arrays.toString(arrayUsingBubbleSort));
    }

    // Bubble Sort implementation
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

            // If no two elements were swapped in the last pass, break
            if (!swapped) break;
        }
    }
}
