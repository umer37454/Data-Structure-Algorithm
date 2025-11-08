package patterns;

public class Pyramid {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern (int n) {
        int space = n;
        for (int i = 0; i < n; i++) {
            for(int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
    }
}
//    *
//   * *
//  * * *
// * * * *
//* * * * *
