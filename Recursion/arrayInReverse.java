import java.util.*;
public class arrayInReverse {
    static void Reverse(int a[], int index) {
        if(index == a.length)
        return;
        Reverse(a, index+1);
        System.out.print(a[index]+" ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int idx = scn.nextInt();
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i<=a.length-1; i++){
            a[i] = scn.nextInt();
        }
        scn.close();
        Reverse(a,idx);
    }
}
