package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapp {
    public static void main(String[] args) {
        HashMap<Integer , String > map = new HashMap<>();
        map.put(1,"Kartik");
        map.put(2,"KK");
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("KK"));
        Set<Integer> keys=  map.keySet();
//        for (int i = 1; i < map.size(); i++) {
//            System.out.println(map.get(i));
//        }
        for (int i = 1; i <= keys.size(); i++) {
            System.out.println(map.get(i));
            
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " + "+ entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey() + " + "+ entry.getValue());

        }


    }
}
