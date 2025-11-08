package patterns;

public class OddEven {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int start;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 2;
            } else {
                start = 3;
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(start);

                if (start == 2) {
                    start = 3;
                } else {
                    start = 2;
                }
            }

            System.out.println();
        }
    }
}

//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1