import java.util.*;
public class displayAnArray {
    static void Array(int a[], int i) {
        for (i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        scn.close();
    }
}
