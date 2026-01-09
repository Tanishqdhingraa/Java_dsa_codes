package Stack_and_Queue;

class QueueArray {
    int[] queue;
    int front, rear, size;

    // Constructor
    QueueArray(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    // Enqueue (insert)
    void enqueue(int value) {
        if (rear == size - 1) { // overflow check
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
        System.out.println(value + " inserted");
    }

    // Dequeue (remove)
    int dequeue() {
        if (front > rear) { // underflow check
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }

    // Peek front
    int peek() {
        if (front > rear)
            return -1;
        return queue[front];
    }

    // Example
    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.peek()); // 10
        System.out.println("Removed: " + q.dequeue()); // 10
        System.out.println("Front after dequeue: " + q.peek()); // 20
    }
}
