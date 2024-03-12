package linked_list.singly_linked_list;

public class LinkedListSelf {
    Node head;
    Node tail;
    int size;

     class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

         public Node(int data, Node next) {
             this.data = data;
             this.next = next;
         }
     }
    public void insertFirst(int data) {
        Node node = new Node(data);
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

    public void insertLast(int data) {
         if (head == null) {
             insertFirst(data);
             return;
         }
         Node node = new Node(data);
         tail.next = node;
         tail = node;
         size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertAt(int index, int data) {
         if (index == 0) {
             insertFirst(data);
             return;
         }

         if (index == size) {
             insertLast(data);
             return;
         }

         if (index < 0 || index > size) {
             System.out.println("Index cannot be less than 0 and greater than size");
             return;
         }

         Node node = new Node(data);
         Node prev = getNodeAtIndex(index - 1);
         node.next = prev.next;
         prev.next = node;
         size++;
    }
    private Node getNodeAtIndex(int index) {
         Node temp = head;
         for (int i = 0; i < index; i++) {
             temp = temp.next;
         }
         return temp;
    }

    public void deleteFirst() {
         if (head == null) {
             System.out.println("LinkedList is empty");
             return;
         }
         if (head == tail) {
             head = null;
             tail = null;
             size--;
             return;
         }
         head = head.next;
         size--;
    }

    public void deleteLast() {
         if (head == tail) {
             deleteFirst();
             return;
         }
         Node prevTail = getNodeAtIndex(size - 2);
         tail = prevTail;
         tail.next = null;
         size--;
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index == size - 1) {
            deleteLast();
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index cannot be less than 0 and greater than size");
            return;
        }

        Node temp = getNodeAtIndex(index - 1);
        temp.next = temp.next.next;
        size--;
    }

}
