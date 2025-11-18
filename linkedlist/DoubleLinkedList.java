package linkedlist;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    public int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("END");
        System.out.println();
    }

    public void reverseDisplay() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.previous;
        }

        System.out.print("END");
        System.out.println();
    }

    private Node get(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void addFirst(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        head.previous = node;
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.previous = tail;
        tail = node;
        size++;
    }

    public void add(int value, int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size - 1) {
            addLast(value);
            return;
        }

        Node temp = get(index);
        Node next = temp.next;

        Node node = new Node(value, next, temp);

        temp.next = node;
        next.previous = node;

        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }

        size--;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }

        size--;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node deleted = get(index);

        Node previous = deleted.previous;
        Node next = deleted.next;

        previous.next = next;
        next.previous = previous;

        deleted.previous = deleted.next = null;

        size--;
    }
}
