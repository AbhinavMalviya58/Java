import java.util.*;

public class highestFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // if (map.containsKey(ch)) {
        // int of = map.get(ch);
        // int nf = of + 1;
        // map.put(ch, nf);
        // }else {
        // map.put(ch, 1);
        // }
        // }

        char[] arr = str.toCharArray();
        for (char ch : arr) {
            // char nch = str.charAt(ch);
            if (map.containsKey(ch)) {
                int of = map.get(ch);
                int nf = of + 1;
                map.put(ch, nf);
                System.out.println(ch + " = " + nf) ;
            } else {
                map.put(ch, 1);
            }
        }
        char mfc = str.charAt(0);
        for (char val : map.keySet()) {
            if (map.get(val) > map.get(mfc)) {
                mfc = val;
            }
        }
        System.out.println("Highest Frequency = " + mfc);
    }
}
