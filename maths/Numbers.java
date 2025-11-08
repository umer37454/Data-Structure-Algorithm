package maths;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(palindrome(1212));
        System.out.println(armstrong(370));
    }

    public static boolean palindrome(int n) {
        int number = n;
        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }

        return reverse == number;
    }

    public static boolean armstrong(int n) {
        int number = n;
        int result = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            result = result + (int) Math.pow(lastDigit, 3);
            n = n / 10;
        }

        return result == number;
    }
}
