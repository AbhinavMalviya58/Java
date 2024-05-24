import java.util.Scanner;

public class climbingStairsDP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int Tabulation = stairsTabulation(num);
        // int stair = stairs(num);
        System.out.println(Tabulation);
        // System.out.println(m);
    }

    // normal recursion
/* 
    static int stairs(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            return 0;
        }
        System.out.println("stairs call " + num);
        int n1 = stairs(num - 1);
        int n2 = stairs(num - 2);
        int n3 = stairs(num - 3);
        int sum = n1 + n2 + n3;
        return sum;
    }
*/
    // Memoization DP recursion
/* 
    static int stairsMemoization(int num, int[] qb) {
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            return 0;
        }
        if (qb[num] != 0) {
            return qb[num];
        }
        System.out.println("Memoization call " + num);
        int n1 = stairsMemoization(num - 1, qb);
        int n2 = stairsMemoization(num - 2, qb);
        int n3 = stairsMemoization(num - 3, qb);
        int sum = n1 + n2 + n3;
        qb[num] = sum;
        return sum;
    }
*/
    // Tabulation DP recursion

    static int stairsTabulation(int num) {

        int[] qb = new int[num + 1];

        qb[0] = 1;
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                qb[i] = qb[i - 1];
            } else if (i == 2) {
                qb[i] = qb[i - 1] + qb[i - 2];
            } else {
                qb[i] = qb[i - 1] + qb[i - 2] + qb[i - 3];
            }
        }
        return qb[num];
    }
}
