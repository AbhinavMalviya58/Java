import java.util.*;
public class maximumOfAnArray {
    static int max(int[] a, int idx){
        if(idx == a.length-1){
            return a[idx];
        }
        int num = max(a, idx+1);
        if(num > a[idx]){
            return num;
        }
        return a[idx];

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
        int num = max(a,idx);
        System.out.println("Max is "+num);
    }
}
