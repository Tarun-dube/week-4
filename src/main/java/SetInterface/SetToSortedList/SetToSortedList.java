package SetInterface.SetToSortedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetToSortedList {
    public static List<Integer> intoSortedList(Set<Integer>set){
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set1 = new TreeSet<>();
        set1.addAll(set);
        list.addAll(set1);
        return list;
    }
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(9);
        System.out.println("Set: " + set);
        List<Integer> list = intoSortedList(set);
        System.out.println("Sorted List: "+list);

    }
}
