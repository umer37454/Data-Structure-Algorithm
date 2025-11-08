package maths;

public class BinarySquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.println(answer(n, p));
    }

    public static double answer(int n, int p) {
        double root = 0.0;

        int start = 0;
        int end = n;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (middle * middle == n) {
                return middle;
            }

            if (middle * middle > n) {
                end = middle - 1;
            } else {
                start = middle + 1;
                root = middle;
            }
        }

        double increment = 0.1;
        for (int i = 0; i <= p; i++) {
            while (root * root <= n) {
                root = root + increment;
            }

            root = root - increment;
            increment = increment / 10;
        }

        return root;
    }
}
