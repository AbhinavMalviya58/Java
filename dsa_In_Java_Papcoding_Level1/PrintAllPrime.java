import java.util.Scanner;

public class PrintAllPrime 
{
    public static void main(String[] args)
    {
        try( Scanner scn = new Scanner(System.in))
        {
            System.out.println(" Enter a 1st number ");
            int n1 = scn.nextInt();
            System.out.println(" Enter a 2nd number ");
            int n2 = scn.nextInt();
            for(int n = n1; n <= n2; n++)
            {
                int count = 0;
                
                // try to divide n and incrtease
                
                for(int div = 2; div*div <= n; div++)
                {
                    if(n % div == 0)
                    {
                        count++;
                        break;
                    }
                }
                
                // try to divide n and incrtease
                
                        if(count == 0)
                        System.out.println(n);
            }
        }
    }
}
