package linkedlist;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.addLast(14);
        list.addLast(42);
        list.addLast(32);
        list.addLast(10);
        list.addLast(24);

        list.add(17, 3);
        list.display();

        list.delete(3);
        list.display();

        list.add(56, 5);
        list.display();

        System.out.println("---- New Reverse LL ----");
        list.reverse();
        System.out.println("---- Original LL ----");
        list.display();

        list.originalReverseTwo();
        list.display();

        System.out.println(list.size);
    }
}
