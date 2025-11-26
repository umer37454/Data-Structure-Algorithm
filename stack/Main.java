package stack;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(10);

        stack.add(42);
        stack.add(14);
        stack.add(23);
        stack.add(35);

        stack.display();
    }
}
