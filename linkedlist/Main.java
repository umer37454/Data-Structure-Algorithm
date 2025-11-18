package linkedlist;

public class Main {
    public static void main(String[] args) {
//        SingleLinkedList list = new SingleLinkedList();
//
//        list.addLast(14);
//        list.addLast(42);
//        list.addLast(32);
//        list.addLast(10);
//        list.addLast(24);
//
//        list.add(17, 3);
//        list.display();
//
//        list.delete(3);
//        list.display();
//
//        list.add(56, 5);
//        list.display();
//
//        System.out.println("---- New Reverse LL ----");
//        list.reverseDisplay();
//        System.out.println("---- Original LL ----");
//        list.display();
//
//        list.reverseTwo();
//        list.display();
//
//        System.out.println(list.size);

        DoubleLinkedList doubleList = new DoubleLinkedList();

        doubleList.addFirst(12);
        doubleList.addFirst(14);
        doubleList.addFirst(8);
        doubleList.addFirst(24);
        doubleList.addLast(13);
        doubleList.addLast(5);
        doubleList.addLast(32);
        doubleList.add(10, 3);

        doubleList.deleteFirst();
        doubleList.deleteLast();
        doubleList.delete(2);

        doubleList.display();
        doubleList.reverseDisplay();

        System.out.println("Current Size of DLL : " + doubleList.size);
    }
}
