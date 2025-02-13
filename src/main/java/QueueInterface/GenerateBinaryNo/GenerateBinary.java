package QueueInterface.GenerateBinaryNo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBinary {
    public static List<String> generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        queue.offer("1");
        int total=0;

        while(total<n){
            String s = queue.poll();
            list.add(s);
            queue.offer(s+"0");
            queue.offer(s+"1");

            total++;
        }
        System.out.println();
        return list;

    }
    public static void main(String[] args) {
        List<String> list=generateBinary(10);
        System.out.println(list);

    }
}
