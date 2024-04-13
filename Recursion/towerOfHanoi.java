import java.util.*;

    /*
    Move pol A to B     
                |                               |                                       |
                |                               |                                       |
            ---------                           |                                       |
1           |   |   |                           |                                       |
        -----------------                       |                                       |
2       |       |       |                       |                                       |
    -------------------------                   |                                       |
3   |           |           |                   |                                       |
------------------------------------------------------------------------------------------------------------------------------
                A                               B                                       C
*/
public class towerOfHanoi {
    static void tower(int n, String t1,String t2,String t3){
        if(n==0){
            return;
        }

        tower(n-1, t1, t3, t2);
        System.out.println(n+"["+t1+"=>"+t2+"]");
        tower(n-1, t3, t2, t1);

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String a = scn.next();
        String b = scn.next();
        String c = scn.next();
        scn.close();
        tower(n, a, b, c);

    }
}
