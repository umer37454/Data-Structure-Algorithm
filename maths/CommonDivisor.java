package maths;

public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcdHcf(74, 85));
        System.out.println(euclidean(74, 85));
        System.out.println(euclideanSimple(45, 85));
    }

    public static int gcdHcf(int number1, int number2) {
        int result = 1;

        for (int i = 1; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                result = i;
            }
        }

        return result;
    }

    public static int euclidean(int number1, int number2) {
        int a;
        int b;

        while (number1 > 0 && number2 > 0) {
            a = Math.max(number1, number2) % Math.min(number1, number2);
            b = Math.min(number1, number2);

            number1 = a;
            number2 = b;
        }

        return Math.max(number1, number2);
    }

    public static int euclideanSimple(int number1, int number2) {
        while (number1 > 0 && number2 > 0) {
            if(number1 > number2) {
                number1 = number1 %  number2;
            } else {
                number2 = number2 % number1;
            }
        }

        return Math.max(number1, number2);
    }
}
