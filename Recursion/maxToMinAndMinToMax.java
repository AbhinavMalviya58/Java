import java.util.*;
public class maxToMinAndMinToMax {
    static void num(int n){
        if(n<1)
            return;
            System.out.print(n+" ");
            num(n-1);
            System.out.print(n+" ");
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
	    num(n);
	   // System.out.print(k);
	}
}
