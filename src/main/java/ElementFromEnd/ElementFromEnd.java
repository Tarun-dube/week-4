package ElementFromEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ElementFromEnd {
    public static <T> T elementFromEnd(List<T> list, int n) {
        T element=null;
        Stack<T> stack = new Stack<>();
        for(T i : list) {
            stack.push(i);
        }

        while(n!=0) {
            element=stack.pop();
            n--;
        }

        return element;
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(elementFromEnd(list, 3));


        List<String>list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        System.out.println(elementFromEnd(list2, 3));
    }
}
