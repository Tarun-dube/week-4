package SetInterface.SymmetricDifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer> symmetricDiffernce(Set<Integer> a, Set<Integer> b) {
        Set<Integer> diff = new HashSet<Integer>();
        for (Integer i : a) {
            if (!b.contains(i)) {
                diff.add(i);
            }
        }
        for (Integer i : b) {
            if (!a.contains(i)) {
                diff.add(i);
            }
        }
        return diff;
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

        Set<Integer>diff=symmetricDiffernce(set1,set2);
        System.out.println(diff);

    }
}
