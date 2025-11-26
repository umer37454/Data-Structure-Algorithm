package stack;

public class CustomStack {
    private int[] data;
    private final int SIZE = 10;

    private int end = 0;

    public CustomStack() {
        this.data = new int[SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void display() {
        for (int i : data) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public void add(int value) {
        if (isFull()) {
            System.out.println("Error: Cannot add. The array is full!");
            return;
        }

        data[end] = value;
        end++;
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("Error: Cannot delete. The array is empty!");
            return;
        }
        data[end - 1] = 0;
        end--;
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
}
