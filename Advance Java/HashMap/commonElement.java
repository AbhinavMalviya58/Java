import java.util.*;

public class commonElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first array length");
        int firstNumber = scn.nextInt();
        int[] a1 = new int[firstNumber];
        System.out.println("Enter the number");
        for (int i = 0; i < firstNumber; i++) {
            a1[i] = scn.nextInt();
        }
        System.out.println("Enter the second array lrngth");
        int secondNumber = scn.nextInt();
        int[] a2 = new int[secondNumber];
        System.out.println("Enter the number");
        for (int i = 0; i < secondNumber; i++) {
            a2[i] = scn.nextInt();
        }
        scn.close();
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for (int val : a1) {
            if (fmap.containsKey(val)) {
                int of = fmap.get(val);
                int nf = of + 1;
                fmap.put(val, nf);
            } else {
                fmap.put(val, 1);
            }
        }
        for (int val : a2) {
            if (fmap.containsKey(val)) {
                System.out.println("the common is"+val);
                fmap.remove(val);
            }
        }
    }
}