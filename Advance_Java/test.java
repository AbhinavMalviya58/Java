import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int of = map.get(ch);
                int nf = of + 1;
                map.put(ch, nf);
            } else {
                map.put(ch, 1);
            }
        }
        // int mf = map.get(str.charAt(0));
        char mfc = str.charAt(0);
        for (char val : map.keySet()) {
            if (map.get(val) > map.get(mfc)) {
                mfc = val;
            }
        }
        System.out.println(mfc);
        System.out.println(map.get(keys));
        System.out.println(mfc);
    }
}

