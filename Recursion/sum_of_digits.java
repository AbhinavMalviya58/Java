import java.util.*;
public class sum_of_digits {
    static int sum(int n){
        if(n==0)
        return 0;
        return n%10+sum(n/10);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int k = sum(n);
        System.out.println(k);
    }
}
