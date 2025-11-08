package sorting;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] numbers = {8, 5, 7, 4, 9, 6};
        int[] number = {84, 15, 10, 48, 58, 65};

        sorting(number);
        System.out.println(Arrays.toString(number));

        System.out.println(Arrays.toString(largestValueSort(numbers)));
        System.out.println(Arrays.toString(smallestValueSort(number)));
    }

    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;
            int max = largest(arr, 0, last);

            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }

    public static int largest(int [] arr, int start, int last) {
        int max = start;

        for (int i = start; i <= last; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    public static int[] largestValueSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int maximumValue = array[0];
            int position = 0;

            for(int j = 0; j < array.length - i; j++) {
                if(maximumValue < array[j]) {
                    maximumValue = array[j];
                    position = j;
                }
            }

            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = maximumValue;
            array[position] = temp;
        }

        return array;
    }

    public static int[] smallestValueSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < array.length; j++) {
                if(array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
