package Stack_and_Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLibraryExample {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(5); // insert
        q.add(15);
        q.add(25);

        System.out.println(q.peek()); // 5
        System.out.println(q.remove()); // 5
        System.out.println(q.peek()); // 15
    }
}
