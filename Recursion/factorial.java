import java.util.*;
public class factorial {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int k = fact(n);
        System.out.println(n+" factorial is "+k);
    }
    static int fact(int n){
        if(n==0)
        return 1;
        int s = n * fact(n-1);
        return s;
    }
}