package recursion;

public class PrintName {
    public static void main(String[] args) {
        print(1, 3);
    }

    public static void print(int i, int n) {
        if(i > n) {
            return;
        }

        System.out.println("Umer");
        print(i + 1, n);
    }
}
