package linked_list.circular_linkedlist;

public class Main {
    public static void main(String[] args) throws Exception {

        CircularLinkedListSelf circularLinkedListSelf = new CircularLinkedListSelf();
        circularLinkedListSelf.insertLast(10);
        circularLinkedListSelf.insertLast(15);
        circularLinkedListSelf.insertLast(25);
        circularLinkedListSelf.insertLast(30);

        circularLinkedListSelf.insertFirst(5);
        circularLinkedListSelf.insertFirst(0);

        circularLinkedListSelf.insertAt(4, 20);

        System.out.println(circularLinkedListSelf.size);
        circularLinkedListSelf.display();

        circularLinkedListSelf.deleteFirst();
        circularLinkedListSelf.deleteLast();
        circularLinkedListSelf.deleteAtIndex(2);

        circularLinkedListSelf.display();

        circularLinkedListSelf.deleteLast();
        circularLinkedListSelf.deleteLast();
        circularLinkedListSelf.deleteLast();
        circularLinkedListSelf.deleteLast();
        circularLinkedListSelf.deleteLast();

        circularLinkedListSelf.display();
    }
}
