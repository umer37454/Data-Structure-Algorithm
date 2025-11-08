package patterns;

public class VPattern {
    public static void main(String[] args) {
        pattern(4);
        System.out.println("-------");
        System.out.println("-------");
        starPattern(4);
        System.out.println("-------");
        System.out.println("-------");
        numberPattern(5);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int end = 2 * n - i + 1;

            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j < end) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void numberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int end = 2 * n - i + 1;

            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j < end) {
                    System.out.print(" ");
                } else {
                    if (j > n) {
                        System.out.print(2 * n - j + 1);
                    } else {
                        System.out.print(j);
                    }
                }
            }
            System.out.println();
        }
    }
}

//1      1
//12    21
//123  321
//12344321
