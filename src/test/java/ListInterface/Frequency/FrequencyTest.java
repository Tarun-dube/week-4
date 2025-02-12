package Frequency;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static Frequency.Frequency.frequencyOfItem;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {
    @Test
    void testFrequency() {
        String[] item={"apple","banana", "apple", "orange"};
        Map<String,Integer> m=frequencyOfItem(item);

        assertEquals(2,m.get("apple"));
        assertEquals(1,m.get("banana"));
        assertEquals(1,m.get("orange"));
    }

}