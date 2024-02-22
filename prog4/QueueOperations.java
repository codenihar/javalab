import java.util.*;

class QueueOperations {
    private static final int MAX_SIZE = 10;
    private int front = 0;
    private int rear = -1;
    private int[] queue = new int[MAX_SIZE];

    public void insert(int item) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = item;
    }

    public int delete() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front++];
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        QueueOperations queue = new QueueOperations();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.display();
        System.out.println("Deleted element: " + queue.delete());
        queue.display();
    }
}
