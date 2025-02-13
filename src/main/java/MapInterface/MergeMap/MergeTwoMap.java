package MapInterface.MergeMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MergeTwoMap {
    public static Map<String,Integer> mergeMap(Map<String,Integer> m1, Map<String,Integer> m2) {
        Map<String,Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> entry : m1.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String,Integer> entry : m2.entrySet()) {
            if (result.containsKey(entry.getKey())) {

               int value = m1.get(entry.getKey()) + entry.getValue();
                result.put(entry.getKey(),value );
            }
            else {
                result.put(entry.getKey(),entry.getValue());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Map<String,Integer> m1 = new LinkedHashMap<>();
        Map<String,Integer> m2 = new LinkedHashMap<>();
        m1.put("one",1);
        m1.put("two",2);
        m1.put("three",3);
        m1.put("four",4);
        m2.put("three",3);
        m2.put("four",4);
        m2.put("five",5);
        m2.put("six",6);
        Map<String,Integer> result = mergeMap(m1,m2);
        for (Map.Entry<String,Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());    
        }

    }
}
