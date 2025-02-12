package SetInterface.UnionIntersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class UnionAndIntesection {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        return set;

    }
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>();
        for(Integer integer : set1) {
            if(set2.contains(integer)) {
                set.add(integer);
            }
        }
        return set;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("UnionSet: " + unionSet);
        Set<Integer> intersectionSet = intersection(set1, set2);
        System.out.println("IntersectionSet: " + intersectionSet);


    }
}
