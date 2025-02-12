package SetInterface.SymmetricDifference;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static SetInterface.SymmetricDifference.SymmetricDifference.symmetricDiffernce;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {
    @Test
    void testSymmetricDifference() {

        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer>diff=symmetricDiffernce(set1,set2);
        Set<Integer>expected=new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);
        assertEquals(expected,diff);
    }

}