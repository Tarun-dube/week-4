package ListInterface.Frequency;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static Map<String,Integer> frequencyOfItem(String[] item) {
        Map<String,Integer> map = new HashMap<>();
        for(String s : item) {
            map.put(s, map.getOrDefault(s,0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        String[] item = {"apple","banana", "apple", "orange"};

        System.out.println(frequencyOfItem(item));
    }
}
