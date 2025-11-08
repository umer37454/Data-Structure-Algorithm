package sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {101, 241, 145, 75, 658, 475};

        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end) {
        if (start <= end) {
            int pivot = middleElementSort(arr, start, end);

            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);
        }
    }

    // this move every smallest element to left and index track last smallest
    // element from left . smallest unsorted elements than pivot

    // you can also check if pivot and arr[pointer] is same then also you can swap.
    // in this case no need to do swap after loop
    public static int lastElementSort(int[] arr, int start, int end) {
        int pivot = arr[end];
        int index = start - 1; // tracks last smallest element

        for (int pointer = start; pointer < end; pointer++) {
            if (arr[pointer] <= pivot) {
                index++; // moving to last smallest element

                int temp = arr[pointer];
                arr[pointer] = arr[index];
                arr[index] = temp;
            }
        }

        index++;

        int temp = arr[index];
        arr[index] = pivot;
        arr[end] = temp;

        return index;
    }

    public static int firstPivotQuickSort(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i < j) {
            while (arr[i] < pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static int middleElementSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[i + (j - i) / 2];

        while (i < j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return j;
    }
}
