package Queue;
import java.util.*;

class MyQueue {
    public static void main(String args[]) {
        QueueusingStack q = new QueueusingStack();
        q.Enque(3);
        q.Enque(4);
        System.out.println("The element poped is " + q.Deque());
        q.Enque(5);
        System.out.println("The top element is " + q.Deque());
        // System.out.println("The size of the queue is " + q.size());

    }
}