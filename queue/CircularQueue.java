package queue;

public class CircularQueue {
    protected int[] data;
    protected int front;
    protected int end;

    private int size = 0;

    public CircularQueue(int size) {
        this.data = new int[size];
        this.front = 0;
        this.end = 0;
    }

    public void display() {
        for(int i = 0; i < data.length; i++) {
            int element = data[(i + front) % data.length];
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public void add(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        data[end] = value;
        end++;
        end = end % data.length;
        size++;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        front++;
        front = front % data.length;
        size--;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
