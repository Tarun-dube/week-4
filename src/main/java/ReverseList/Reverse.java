package ReverseList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Reverse {
    public static void reverse(List<Integer> list) {
        Stack<Integer> stack = new Stack<Integer>();
        for(Integer i : list) {
            stack.push(i);
        }
        list.clear();
        while(!stack.isEmpty()) {
            list.add(stack.pop());
        }
    }
    public static void main(String[] args) {

        System.out.println("Arraylist implementation:");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       System.out.println(list);
        System.out.println("Reversed list");
        reverse(list);
        System.out.println(list);


        System.out.println("Linkedlist implementation:");
        list=new LinkedList<Integer>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        System.out.println(list);
        System.out.println("Reversed linkedlist");
        reverse(list);
        System.out.println(list);

    }
}
