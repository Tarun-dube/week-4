package SetInterface.UnionIntersection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static SetInterface.UnionIntersection.UnionAndIntesection.intersection;
import static SetInterface.UnionIntersection.UnionAndIntesection.union;
import static org.junit.jupiter.api.Assertions.*;

class UnionAndIntesectionTest {
    @Test
    void testunion() {

        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> expected=new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected,unionSet);
    }

    @Test
    void testintersection() {

        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> intersectionSet = intersection(set1, set2);
        Set<Integer> expected=new HashSet<>();
        expected.add(3);

        assertEquals(expected,intersectionSet);
    }

    }

