package QueueInterface.ReverseAqueue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static QueueInterface.ReverseAqueue.ReverseQueue.reverseAqueue;
import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {
    @Test
    void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);// other method for adding
        queue.offer(4);


        reverseAqueue(queue);
        Queue<Integer> expected=new LinkedList<>();
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        assertEquals(expected,queue);
    }

}