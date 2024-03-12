package queues.circular_queue;

public class CircularQueue {
    protected int[] data;
    protected int end = 0;
    protected int front = 0;
    int size = 0;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Circular Queue is full");
            return;
        }
        data[end++] = value;
        end = end % data.length;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty");
            return;
        }
        front++;
        front = front % data.length;
        size--;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty");
        }
        int temp = front;

        do {
            System.out.print(data[temp] + " ");
            temp++;
            temp = temp % data.length;
        }
        while (temp != end);
        System.out.println();
    }
}