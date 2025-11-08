package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = new int[]{42, 50, 4, 8, 32, 17};
//        sort(arr, 0, arr.length - 1);

        int[] merge = sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(merge));
    }

    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + ((end - start) / 2);

            sort(arr, start, mid);
            sort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int high) {
        int rightPointer = mid + 1;
        int leftPointer = start;

        ArrayList<Integer> array = new ArrayList<>();

        while (leftPointer <= mid && rightPointer <= high) {
            if (arr[leftPointer] < arr[rightPointer]) {
                array.add(arr[leftPointer]);
                leftPointer++;
            } else {
                array.add(arr[rightPointer]);
                rightPointer++;
            }
        }

        while (leftPointer <= mid) {
            array.add(arr[leftPointer]);
            leftPointer++;
        }

        while (rightPointer <= high) {
            array.add(arr[rightPointer]);
            rightPointer++;
        }

        for (int i = 0; i < array.size(); i++) {
            arr[i + start] = array.get(i);
        }
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] first = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] second = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(first, second);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mergedArray = new int[first.length + second.length];

        int i = 0;
        int j = 0;

        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                mergedArray[k] = first[i];
                i++;
            } else {
                mergedArray[k] = second[j];
                j++;
            }

            k++;
        }

        while (i < first.length) {
            mergedArray[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mergedArray[k] = second[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
