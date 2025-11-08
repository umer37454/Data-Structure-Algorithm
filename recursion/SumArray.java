package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumArray {
    public static void main(String[] args) {
        System.out.println(sum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7, 10))));
    }

    public static int sum(List<Integer> arr) {
        if(arr.isEmpty()) return 0;
        return arr.removeFirst() + sum(arr);
    }
}
