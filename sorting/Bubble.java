package sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] numbers = {8, 9, 6, 4, 7};

        System.out.println(Arrays.toString(numbers));
        recursiveSort(numbers, 0);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sorting(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void recursiveSort(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }

        for (int j = 1; j < arr.length - i; j++) {
            if (arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }

        recursiveSort(arr, i + 1);
    }
}
