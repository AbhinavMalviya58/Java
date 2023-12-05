import java.util.*;

public class commondElement2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 1 length of array");
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter the element of array");
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }
        System.out.println("Enter the 2 length of arrey");
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter the element of array");
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }
        scn.close();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : a1) {
            if (map.containsKey(val)) {
                int of = map.get(val);
                int nf = of + 1;
                map.put(val, nf);
            } else {
                map.put(val, 1);
            }
        }
        for (int val : a2) {
            if (map.containsKey(val) && map.get(val) > 0) {
                System.out.println("val = "+val);
                // map.remove(val);
                int of = map.get(val);
                int nf = of - 1;
                map.put(val,nf);
            }
        }
    }
} 
