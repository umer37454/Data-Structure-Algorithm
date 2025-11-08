package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci.withoutRecursion(12));
        System.out.println(Fibonacci.withRecursion(12));
        System.out.println(withRecurrence(4));
        System.out.println(withRecurrenceFormula(4));
    }

    public static List<Integer> withoutRecursion(int n) {
        List<Integer> numbers = new ArrayList<>();

        int a = 0;
        int b = 1;
        int temp, c;

        Collections.addAll(numbers, a, b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            numbers.add(c);

            temp = b;
            b = c;
            a = temp;
        }

        return numbers;
    }

    public static List<Integer> withRecursion(int n) {
        List<Integer> numbers = new ArrayList<>();

        int a = 0;
        int b = 1;

        Collections.addAll(numbers, a, b);

        class Recursive {
            public static void recursive(int a, int b, int n, List<Integer> numbers) {
                if (n < 0) {
                    return;
                }
                int c = a + b;
                numbers.add(c);

                int temp = b;
                b = c;
                a = temp;

                n = n - 1;

                recursive(a, b, n, numbers);
            }
        }

        Recursive.recursive(a, b, n, numbers);
        return numbers;
    }

    public static int withRecurrence(int n) {
        if (n < 2) {
            return n;
        }

        return withRecurrence(n - 1) + withRecurrence(n - 2);
    }

    public static int withRecurrenceFormula(int n) {
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
}
