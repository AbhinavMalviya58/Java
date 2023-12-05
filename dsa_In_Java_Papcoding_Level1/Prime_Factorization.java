import java.util.Scanner;

public class Prime_Factorization {
    /*
     * 2|20
     * 2|10
     * 5|5
     *  |1
     */ public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for (int div = 2; div * div <= n; div++) {
            while (n % div == 0) {
                n = n / div;
                System.out.print(div+" ");
            }
        }
        if(n != 1){
            System.out.print(n);
        }
    }
}
