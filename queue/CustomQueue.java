package queue;

public class CustomQueue {
    private int[] data;

    private int end;

    public CustomQueue(int size) {
        this.data = new int[size];
        this.end = 0;
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public void add(int value) {
        if (isFull()) {
            System.out.println("Error: Cannot add. The queue is full!");
            return;
        }

        data[end] = value;
        end++;
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("Error: Cannot delete. The queue is empty!");
            return;
        }

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
}
