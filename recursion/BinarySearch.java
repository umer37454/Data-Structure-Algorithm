package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 9, 12, 17};
        System.out.println(search(arr, 12, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int middle = ( start + end ) / 2;

        if(target == arr[middle]) {
            return middle;
        }

        if(target > arr[middle]) {
            return search(arr, target, middle + 1, end);
        }

        return search(arr, target, start, middle - 1);
    }
}
