package Upgrade;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alan1");
        map.put(2, "Alan2");
        map.put(3, "Alan3");
        map.put(4, "Alan4");
        System.out.println(map);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Alan3"));
        map.remove(3);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<String, String> newMap = new HashMap<>();
        newMap.put("Alan", "Abzalkhanuly");
        System.out.println(newMap.hashCode());
        for(Map.Entry<Integer, String> key : map.entrySet()) System.out.println(key.getKey() + " >> " + key.getValue() );
    }
}
