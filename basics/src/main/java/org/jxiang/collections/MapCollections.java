package org.jxiang.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapCollections {
        // it's best to specify which implementation of map you are using!
    public static void main(String[] args) {
        // HashMap: key-val pair, not ordered, unique keys, hashtable is thread-safe version of HashMap
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("a", 15);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println(map.size() + " | " + map);

        // check if a key exists, similar logics apply to value
        if (map.containsKey("a")) {
            Integer a = map.get("a");
            System.out.println("value for key a is " + a);
        }

        // iterate keys
        for (String key: map.keySet()) {
            System.out.println("key: "+key+", value: "+map.get(key));
        }

        System.out.println("#####################");

        // iterate entries
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key: "+entry.getKey()+", value: "+entry.getValue());
        }


        // TreeMap: key-val pair, ordered, unique keys, not thread-safe
        Map<String, Integer> tMap = new TreeMap<>();

        tMap.put("c", 10);
        tMap.put("a", 15);
        tMap.put("b", 20);
        tMap.put("c", 30);

        System.out.println("tree map: "+tMap);

    }
}
