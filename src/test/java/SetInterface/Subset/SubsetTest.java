package SetInterface.Subset;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static SetInterface.Subset.Subset.isSubset;
import static org.junit.jupiter.api.Assertions.*;

class SubsetTest {
    @Test
    void testSubset() {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        Set<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(1);
        set2.add(2);

        assertTrue(isSubset(set1,set2));
    }

}