package queues;

import java.util.Arrays;
import java.util.List;

public class CustomQueue {
    int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length - 1;

    }
    public boolean isEmpty() {
        return end == -1;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        data[++end] = value;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < end; i++) {
            data[i] = data[i + 1];
        }
        end--;
    }

    public void display() {
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
