import java.util.Scanner;

public class fibonacciDP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = FibMemoization(n,new int[n + 1]);
        System.out.println(k);
    }

    // public static int Fib(int num) {
    //     if (num == 0 || num == 1) {
    //         return num;
    //     } 
    //     int fibNum1 = Fib(num - 1);
    //     int fibNum2 = Fib(num - 2);
    //     int fibNum = fibNum1 + fibNum2;
    //     return fibNum;
    // }

    public static int FibMemoization(int num, int[] qb) {
        if (num == 0 || num == 1) {
            return num;
        } 
        if(qb[num] != 0){
            return qb[num];
        }
        System.out.println("number of call "+num);
        int fibNum1 = FibMemoization(num - 1 , qb);
        int fibNum2 = FibMemoization(num - 2 , qb);
        int fibNum = fibNum1 + fibNum2;
        qb[num] = fibNum;
        return fibNum;
    }
}
