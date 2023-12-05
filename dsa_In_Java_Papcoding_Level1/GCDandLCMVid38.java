import java.util.*;
public class GCDandLCMVid38 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int on1 = n1;
        int on2 = n2;
        while(n1 % n2 != 0){
            int rem = n1 % n2;
                n1 = n2;
                n2 = rem;
        }
        int GCD = n2;
        int LCM = (on1 * on2) / GCD;
        System.out.println(GCD);
        System.out.println(LCM);
    }
}
