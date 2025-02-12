package SetInterface.EqualSets;

import java.util.HashSet;
import java.util.Set;

public class EqualSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(1);
        set2.add(2);

        System.out.println(set1.equals(set2));
    }
}
