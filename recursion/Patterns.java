package recursion;

public class Patterns {
    public static void main(String[] args) {
        linearPattern(5);
        System.out.println();
        oneSideZigZag(5);
    }

    public static void print(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(i);
        }

        System.out.println();
    }

    public static void linearPattern(int n) {
        if(n == 0) {
            return;
        }

        linearPattern(n - 1);
        print(n);
    }

    public static void oneSideZigZag(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        print(n);
        oneSideZigZag(n - 1);
        print(n);
    }
}
