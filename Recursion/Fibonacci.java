import java.util.*;
public class Fibonacci {
    static int fib(int n){
        if(n==0)
        return 0;
        if(n==0||n==1)
        return 1;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int k = fib(n);
        System.out.println("Fibonacci of "+n+" is "+k);
    }
}
