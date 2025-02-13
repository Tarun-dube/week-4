package QueueInterface.StackImplementation;

import java.util.LinkedList;
import java.util.Queue;

class Stack<T>{
    Queue<T> queue=new LinkedList<T>();
    Queue<T> queue2=new LinkedList<>();

    public void push(T t){
        queue.add(t);

        while(!queue2.isEmpty()){
            queue.add(queue2.poll());
        }

        Queue<T>temp=queue2;
        queue2=queue;
        queue=temp;

    }
    public T pop(){
        return queue2.poll();
    }

    public boolean isEmpty(){
        return queue2.isEmpty();
    }

    public  T top(){
        return queue2.peek();
    }
    public int size() {
        return queue2.size();
    }
}
public class StackImplementation {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());


    }
}
