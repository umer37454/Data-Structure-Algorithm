package linkedlist;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    public int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void display() {
        Node temp = head;

        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);

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
            tail.next = node;
            size++;
            return;
        }

        node.next = head;
        head = node;
        tail.next = head;

        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);

        if (tail == null) {
            head = node;
            tail = node;
            tail.next = head;
            size++;
            return;
        }

        tail.next = node;
        tail = node;
        tail.next = head;

        size++;
    }

    public void add(int value, int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = new Node(value, temp.next);
        size++;
    }

    public void deleteFirst() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }

        size--;
    }

    public void deleteLast() {
        if (head == null) return;

        if (head == tail) {
            tail = head = null;
            size--;
            return;
        }

        Node temp = head;

        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }

        temp.next = null;
        tail.next = null;
        tail = temp;
        tail.next = head;

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

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node deleted = temp.next;
        temp.next = deleted.next;
        deleted.next = null;

        size--;
    }
}
