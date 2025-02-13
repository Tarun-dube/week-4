package MapInterface.MaximumValue;

import java.util.HashMap;
import java.util.Map;

public class MaxValue {
    public static String maxValue(Map<String, Integer> map) {
        int max = 0;
        String maxKey = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 11);
        map.put("b", 21);
        map.put("c", 13);
        map.put("d", 4);

        System.out.println(maxValue(map));

    }
}
