package queues.dynamic_queue;

import queues.circular_queue.CircularQueue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(int size) {
        super(size);
    }
    public DynamicQueue() {
        super();
    }

    @Override
    public void insert(int value) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        super.insert(value);
    }
}
