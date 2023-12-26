import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Adding elements to the Map ( .put )
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        System.out.println(map);
        // {C=100, D=500, V=5, X=10, I=1, L=50, M=1000}
        map.put("A", 38);
        map.put("I", 3);
        System.out.println(map);
        // {A=38, C=100, D=500, V=5, X=10, I=3, L=50, M=1000}

        // To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(map.get("I"));
        // 3
        System.out.println(map.get("K"));
        // null

        // (.containsKey) It takes the key element as a parameter and returns True if
        // that element is mapped in the map.
        System.out.println(map.containsKey("L"));
        // true
        System.out.println(map.containsKey("Z"));
        // false

        // (keySet) It basically returns a set view of the keys or we can create a new
        // set and store the key elements in them.
        Set<String> Keys = map.keySet();
        System.out.println(Keys);
        // [A, C, D, V, X, I, L, M]
        for (String key : map.keySet()) {
            Integer val = map.get(key);
            System.out.println(key + " = " + val);
        }
    }
}
