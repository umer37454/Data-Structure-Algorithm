package searching;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 9, 12, 17};
        System.out.println(search(arr, 12, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int start, int end) {
        while (start < end) {
            int middle = start + (end - start) / 2;

            if (target == arr[middle]) {
                return middle;
            }

            if (target > arr[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}
