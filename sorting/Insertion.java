package sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] numbers = {1 ,2, 3, 4, 5};

        sorting(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(sort(numbers)));
    }

    public static int[] sort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            while (i > 0 && array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }

            /*
            for (int j = i; j > 0; j--) {
                if(array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            */
        }

        return array;
    }

    public static void sorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
