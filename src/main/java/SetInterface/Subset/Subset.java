package SetInterface.Subset;

import java.util.HashSet;
import java.util.Set;

public class Subset {
    public static  boolean isSubset(Set<Integer>set1, Set<Integer>set2) {

       if(set2.containsAll(set1)) {return true;}
        return false;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);

        Set<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(1);
        set2.add(2);
        System.out.println(isSubset(set1, set2));


    }
}
