package stacks.custom_stack;
//
//public class CustomStack {
//    protected  int[] data;
//    private static final int DEFAULT_SIZE = 10;
//    int ptr = 0;
//
//    public CustomStack() {
//        this(DEFAULT_SIZE);
//    }
//
//    public CustomStack(int size) {
//        this.data = new int[size];
//    }
//
//    public boolean push(int item) {
//        if (isFull()) {
//            System.out.println("Stack is full");
//            return false;
//        }
//        data[ptr++] = item;
//        return true;
//    }
//
//    public boolean isFull() {
//        return ptr == data.length;
//    }
//    public boolean isEmpty() {
//        return ptr == -1;
//    }
//
//    public int pop() {
//        ptr--;
//        if (isEmpty()) {
//            System.out.println("Cannot pop from an empty array");
//            return -1;
//        }
//        return data[ptr];
//    }
//    public int peek() {
//        if (isEmpty()) {
//            System.out.println("Cannot peek from an empty stack");
//        }
//        return data[ptr];
//    }
//
//    public void display() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty");
//            return;
//        }
//        for (int i = 0; i < ptr; i++) {
//            System.out.print(data[i] + " -> ");
//        }
//        System.out.println();
//    }
//}



public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int ptr = -1;

    public static void main(String[] args) {
    }
    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        data[++ptr] = item;
    }
    protected boolean isFull() {
        return ptr == data.length - 1;
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        ptr--;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }

    public void display() {
        for (int i = 0; i <= ptr; i++) {
            System.out.println(data[i]);
        }
        System.out.println("--------------");
    }
}