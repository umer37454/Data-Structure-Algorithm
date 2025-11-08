package recursion;

public class Sample {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("Hello Word");
        message1();
    }

    static void message1() {
        System.out.println("Hello Word");
        message2();
    }

    static void message2() {
        System.out.println("Hello Word");
        message3();
    }

    static void message3() {
        System.out.println("Hello Word");
        message4();
    }

    static void message4() {
        System.out.println("Hello Word");
    }
}
