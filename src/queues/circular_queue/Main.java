package queues.circular_queue;

public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.insert(5);
        circularQueue.insert(10);
        circularQueue.insert(15);
        circularQueue.insert(20);
        circularQueue.insert(25);
        circularQueue.insert(30);

        circularQueue.display();

        circularQueue.remove();
        circularQueue.display();

        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();

        circularQueue.display();
        circularQueue.remove();

        circularQueue.display();
        circularQueue.remove();

        circularQueue.insert(5);
        circularQueue.display();
    }
}
