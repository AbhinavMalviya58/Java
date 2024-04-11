import java.util.*;
public class nNaturalNumbers {
    static void nNaturalNum(int n) {
        if (n > 1)
            nNaturalNum(n - 1);
        System.out.printf(n+" ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.print("Natural Numbers = ");
        nNaturalNum(n);
    }
}
