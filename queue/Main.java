package queue;

public class Main {
    static void main() {
        CircularQueue queue = new CircularQueue(6);

        queue.add(7);
        queue.add(9);
        queue.add(6);
        queue.add(4);
        queue.add(5);
        queue.add(2);

        queue.display();

        queue.remove();

        queue.add(3);

        queue.display();
    }
}
