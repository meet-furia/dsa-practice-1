package queues;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue(5);
        customQueue.insert(5);
        customQueue.insert(10);
        customQueue.insert(15);
        customQueue.insert(20);
        customQueue.insert(25);
        customQueue.insert(30);
        customQueue.display();

        customQueue.remove();
        customQueue.remove();

        customQueue.display();

        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.display();
        customQueue.remove();

    }
}
