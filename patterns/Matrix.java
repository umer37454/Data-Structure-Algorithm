package patterns;

public class Matrix {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        int length = 2 * n - 1;

//        for (int i = 0; i < length; i++) {
//
//            for (int j = 0; j < length; j++) {
//                if (i == 0 || i == length - 1 || j == 0 || j == length - 1) {
//                    System.out.print(n);
//                } else {
//                    System.out.print("*");
//                }
//            }
//
//            System.out.println();
//        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int left = 2 * n -1 - i;
                int bottom = 2 * n - 1 - j;

                int result = n - Math.min(Math.min(j, i), Math.min(left, bottom));

                System.out.print(result);
            }

            System.out.println();
        }
    }
}

//        4444444
//        4333334
//        4322234
//        4321234
//        4322234
//        4333334
//        4444444