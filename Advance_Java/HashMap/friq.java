import java.util.HashMap;

public class friq {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 1, 1, 4, 5 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : array) {
            if (!map.containsKey(val)) {
                map.put(val, 1);
            } else {
                int freq = map.get(val);
                map.put(val, freq + 1);
            }
        }
        System.out.print(map);
    }
}
