package QueueInterface.StackImplementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplementationTest {
    @Test
    void testPush() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        assertTrue(!stack.isEmpty());
    }

    @Test
    void testPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
    }

    @Test
    void testTop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2,stack.top());
    }

}