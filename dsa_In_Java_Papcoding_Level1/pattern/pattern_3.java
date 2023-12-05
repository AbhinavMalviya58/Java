import java.util.*;
/*
                    *
                *   *
            *   *   *
        *   *   *   *
    *   *   *   *   *  
 */

public class pattern_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int nsp = n - 1;
        int nst = 1;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }
            for( int j = 1; j <= nst; j++){
                System.out.print("*\t");
            }
            nsp--;
            nst++;
            System.out.println(" ");
        }
    }
}
