package recursion;

public class Add {
    public static void main(String[] args) {
        System.out.println(add(10));
    }

    public static int add(int n) {
        if(n == 0) {
            // this return will return the flow of the program to where the function was called
            return 0;
        }

        // all the func will be in stack until the last one is solved
        // return will break the function
        return n + add(n - 1);
    }
}
