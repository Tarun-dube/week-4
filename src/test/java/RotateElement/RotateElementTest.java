package RotateElement;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.rotate;
import static org.junit.jupiter.api.Assertions.*;

class RotateElementTest {
    @Test
    void testRotateElement() {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        rotate(list,2);
        List<Integer> expected=new ArrayList<>();
        expected.add(3);
        expected.add(4);
        expected.add(1);
        expected.add(2);
        assertEquals(expected,list);
    }

}