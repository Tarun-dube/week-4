package ListInterface.ElementFromEnd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static ListInterface.ElementFromEnd.ElementFromEnd.elementFromEnd;
import static org.junit.jupiter.api.Assertions.*;

class ElementFromEndTest {
    @Test
    void testElementFromEnd() {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        assertEquals(4,elementFromEnd(list,3));
    }

}