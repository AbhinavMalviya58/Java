import java.util.*;

public class pythagoreanTriplets31_32 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); 
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

            // chack who is max 

        int max = a;
            if(b >= max){
                max = b;
            }
            if(c >= max){
                max = c;
            }

            // chack pythagorean

            if(max == a){
                boolean flag = (( b * b + c * c ) == (a * a));
                    System.out.println(flag);
            }
            else if(max == b){
                boolean flag = ((a * a + c * c) == (b * b));
                System.out.println(flag);
            }
            else{
                boolean flag = ((a * a + b * b) == (c * c));
                System.out.println(flag);
            }
    }
}
