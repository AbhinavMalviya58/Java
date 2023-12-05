import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args)
    {
        try(Scanner scn = new Scanner(System.in))
        {
            long n = scn.nextLong();
            int dig = 0;
            while(n != 0)
            {
                n = n / 10;
                dig++;
            }
            System.out.println(dig);
        }
    }
}
