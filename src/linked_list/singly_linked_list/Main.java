package linked_list.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedListSelf linkedListSelf = new LinkedListSelf();


        linkedListSelf.insertLast(5);
        linkedListSelf.insertLast(10);

        linkedListSelf.insertLast(20);
        linkedListSelf.insertLast(25);
//        linkedListSelf.add(25);

        linkedListSelf.insertAt(3, 15);
        linkedListSelf.insertFirst(0);

        linkedListSelf.display();
        System.out.println(linkedListSelf.head.data);
        System.out.println(linkedListSelf.size);

        linkedListSelf.deleteFirst();
        linkedListSelf.deleteLast();

        linkedListSelf.display();
        linkedListSelf.deleteAtIndex(2);
        linkedListSelf.display();

        linkedListSelf.deleteLast();
        linkedListSelf.deleteLast();
        linkedListSelf.deleteLast();
        linkedListSelf.deleteLast();
        linkedListSelf.deleteLast();

        linkedListSelf.display();
    }
}
