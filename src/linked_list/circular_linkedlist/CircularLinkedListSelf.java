package linked_list.circular_linkedlist;

import linked_list.doubly_linked_list.DoublyLinkedListSelf;

public class CircularLinkedListSelf {
    Node head;
    Node tail;
    int size;
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public int insertFirst(int value) {
        if (head == null) {
            Node node = new Node(value);
            head = node;
            tail = node;
            size++;
            return node.value;
        }
        Node node = new Node(value, head);
        head = node;
        tail.next = node;
        size++;
        return node.value;
    }

    public int insertLast(int value) {
        if (head == null) {
            return insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        tail.next = head;
        size++;
        return node.value;
    }

    public int insertAt(int index, int value) {
        if (index == 0) {
            return insertLast(value);
        }
        if (index == size) {
            return insertLast(value);
        }
        if(index < 0 || index > size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Index cannot be less than 0 or more than size");
            }
        }

        Node prev = getNodeAt(index - 1);
        Node node = new Node(value, prev.next);

        prev.next = node;
        size++;
        return node.value;
    }

    private Node getNodeAt(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
//        Node temp = head;
//        if (temp == null) {
//            System.out.println("Empty");
//            return;
//        }
//        System.out.print(temp.value + " -> ");
//        temp = temp.next;
//        while (temp != tail || temp != null) {
//            System.out.print(temp.value + " -> ");
//            temp = temp.next;
//        }
        Node temp = head;
        if (temp == null) {
            System.out.println("Linked List is empty");
            return;
        }
        while (temp != tail) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.value + " -> ");
        System.out.println("-------------------------------------------------");

    }

    public int deleteFirst() {
        if (head == null) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Linked List is empty");
            }
            return -1;
        }
        if (head == tail) {
            int temp = head.value;
            head = null;
            tail = null;
            size--;
            return temp;
        }
        int temp = head.value;
        head = head.next;
        tail.next = head;
        size--;
        return temp;
    }

    public int deleteLast() throws Exception {
        if (head == null || head == tail) {
            return deleteFirst();
        }
        int temp = tail.value;
        Node prev = getNodeAt(size - 2);
        prev.next = prev.next.next;
        tail = prev;
        size--;
        return temp;
    }
    //
    public int deleteAtIndex(int index) throws Exception {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Index cannot be less than 0 or equal to or more than size");
            }
        }
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = getNodeAt(index - 1);
        int temp = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return temp;
    }

}