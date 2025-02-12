package SetInterface.SetToSortedList;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static SetInterface.SetToSortedList.SetToSortedList.intoSortedList;
import static org.junit.jupiter.api.Assertions.*;

class SetToSortedListTest {
    @Test
    void testintoSortedList() {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(9);

        List<Integer> list = intoSortedList(set);
        List<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(9);
        assertEquals(expected, list);
    }

}