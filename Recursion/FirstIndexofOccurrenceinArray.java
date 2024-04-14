import java.util.*;
public class FirstIndexofOccurrenceinArray {

    static int firstIndex(int[] a,int idx,int data){
        if(idx == a.length){
            return -1;
        }
        if(a[idx] == data){
            return idx;
        }else{
            int index = firstIndex(a, idx+1, data);
            return index;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arry = scn.nextInt();
        int[] num = new int[arry];
        for(int i = 0; i<=num.length-1; i++){
            num[i] = scn.nextInt();
        }
        System.out.println("data");
        int data = scn.nextInt();
        scn.close();
        int ans = firstIndex(num, 0, data);
        System.out.println("index is "+ans);
    }
}
