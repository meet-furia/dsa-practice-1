package linked_list.doubly_linked_list;

public class Main {
    public static void main(String[] args) throws Exception {

        DoublyLinkedListSelf doublyLinkedListSelf = new DoublyLinkedListSelf();
        doublyLinkedListSelf.insertLast(10);
        doublyLinkedListSelf.insertLast(15);
        doublyLinkedListSelf.insertLast(25);
        doublyLinkedListSelf.insertLast(30);

        doublyLinkedListSelf.insertFirst(5);
        doublyLinkedListSelf.insertFirst(0);

        doublyLinkedListSelf.insertAt(4, 20);

        doublyLinkedListSelf.display();
        doublyLinkedListSelf.displayReverse();

        doublyLinkedListSelf.deleteFirst();
        doublyLinkedListSelf.deleteLast();
        doublyLinkedListSelf.deleteAtIndex(2);

        doublyLinkedListSelf.display();
        doublyLinkedListSelf.displayReverse();

        doublyLinkedListSelf.deleteLast();
        doublyLinkedListSelf.deleteLast();
        doublyLinkedListSelf.deleteLast();
        doublyLinkedListSelf.deleteLast();
        doublyLinkedListSelf.deleteLast();
    }
}
