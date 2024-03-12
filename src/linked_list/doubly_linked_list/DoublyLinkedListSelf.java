package linked_list.doubly_linked_list;

public class DoublyLinkedListSelf {
    Node head;
    Node tail;
    int size;

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
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
        Node node = new Node(value);
        node.next = head;
        head.prev = node;
        head = node;
        size++;
        return node.value;
    }

    public int insertLast(int value) {
        if (head == null) {
            return insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
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
        Node node = new Node(value, prev, prev.next);
        node.next.prev = node;
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
        System.out.print("Start -> ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayReverse() {
        System.out.print("End -> ");
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("Start");

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
        head.prev = null;
        size--;
        return temp;
    }

    public int deleteLast() throws Exception {
        if (head == null || head == tail) {
            return deleteFirst();
        }
        int temp = tail.value;
        tail = tail.prev;
        tail.next = null;
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
        prev.next.prev = prev;
        size--;
        return temp;
    }

}
