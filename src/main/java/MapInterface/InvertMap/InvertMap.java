package MapInterface.InvertMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static <V, K> Map<V, List<K>>  invertMap(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<V, List<K>>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();
          if(result.containsKey(value)) {
              result.get(value).add(key);
          }
          else {
              List<K> keys = new ArrayList<>();
              keys.add(key);
              result.put(value, keys);
          }
        }
     return result;
    }
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 1);
        map.put("E", 2);

        System.out.println("Map: " + map);
        System.out.println("Invert Map: " + invertMap(map));

    }
}
