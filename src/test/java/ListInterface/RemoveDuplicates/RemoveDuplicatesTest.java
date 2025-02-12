package RemoveDuplicates;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static RemoveDuplicates.RemoveDuplicates.removeDuplicates;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    void testRemoveDuplicates() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        removeDuplicates(list);
        assertEquals(3, list.size());
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, list);

    }

}