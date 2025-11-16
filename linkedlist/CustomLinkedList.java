package linkedlist;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    public int size;

    public CustomLinkedList () {
        this.size = 0;
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

    private Node get (int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
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

    public void addFirst(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        node.next = head;
        head = node;

        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);

        if (tail == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        tail = node;
        node.next = null;

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

    public void deleteFirst () {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }

        size--;
    }

    public void deleteLast () {
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
        tail = temp;

        size--;
    }

    public void delete (int index) {
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

    public void reverse () {
        Node temp = head;

        CustomLinkedList reverse = new CustomLinkedList();

        for (int i = 0; i < size; i++) {
            reverse.addFirst(temp.value);
            temp = temp.next;
        }

        reverse.display();
    }

    public void originalReverse () {
        if (head == null || head.next == null) return;

        Node curr = head;

        head = tail;
        tail = curr;

        Node next;
        Node prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
    }

    public void originalReverseTwo () {
        if (head == null || head.next == null) return;

        Node temp = head;

        head = tail;
        tail = temp;

        Node prev = null;
        Node next;

        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            next = temp.next;

            head.next = temp;
            temp.next = prev;

            prev = temp;
            temp = next;

            display();
        }
    }
}
