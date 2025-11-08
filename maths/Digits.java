package maths;

public class Digits {
    public static void main(String[] args) {
        System.out.println(count(4521));
        System.out.println(logCount(4521));
        System.out.println(reverse(410));
    }

    public static int count(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    // division involves log. so if repeatedly divided by 10 then log 10 if 2 then log 2
    public static int logCount(int n) {
        return (int) (Math.log10(n) + 1);
    }

    public static int reverse(int n) {
        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return reverse;
    }
}
