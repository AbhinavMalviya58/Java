import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            while(n > 0){
                int dig = n % 10;
                n = n / 10;
                System.out.println(dig);
            }
        }
    }
}