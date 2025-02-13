package QueueInterface.ReverseAqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverseAqueue(Queue<Integer> queue) {
        if(!queue.isEmpty()){

            int a=queue.poll();
            reverseAqueue(queue);
            queue.add(a);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);// other method for adding
        queue.offer(4);

        System.out.println("queue: " + queue);
        reverseAqueue(queue);
        System.out.println("Reversed queue: " + queue);

    }
}
