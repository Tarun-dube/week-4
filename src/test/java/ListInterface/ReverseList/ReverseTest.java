package ReverseList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import static ReverseList.Reverse.reverse;
import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    @Test
    void testReverseArrayList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
         reverse(list);
        List<Integer>expected=new ArrayList<>();
        expected.add(3);
        expected.add(2);
        expected.add(1);

        assertEquals(expected,list,"test case failed");

    }

    @Test
    void testReverseLinkedList() {
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        reverse(list);
        List<Integer> expected=new ArrayList<>();
        expected.add(3);
        expected.add(2);
        expected.add(1);
        assertEquals(expected,list,"test case failed");
    }

}