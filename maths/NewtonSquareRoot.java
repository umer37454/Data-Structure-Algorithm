package maths;

public class NewtonSquareRoot {
    public static void main(String[] args) {
        System.out.println(answer(40));
    }

    // always remember to first put x in the formula and after getting the answer
    // subtract that answer with the x that you took in the first step
    public static double answer(double n) {
        double root;
        double x = n;

        while (true) {
            root = 0.5 * (x + (n / x));

            if(Math.abs(root - x) < 1) {
                break;
            }

            x = root;
        }

        return root;
    }
}
