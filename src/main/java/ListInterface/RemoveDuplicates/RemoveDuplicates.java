package RemoveDuplicates;

import java.util.*;


public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);

        System.out.println(list);

        removeDuplicates(list);
        System.out.println("After removig duplicate elements:");
        System.out.println(list);
    }
}
