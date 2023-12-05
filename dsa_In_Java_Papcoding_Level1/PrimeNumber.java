import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[] args)
    {

        try (Scanner scn = new Scanner(System.in)) 
        {
            int t = scn.nextInt();

            for(int i = 0; i < t; i++)

// <------------------------> fast Method <-------------------------->

            // {
            //     int n = scn.nextInt();

            //     int count = 0;
            //     for(int div = 1;div <=n; div++)
            //     {
            //         if(n % div == 0)
            //         {
            //             count++;
            //         }                                  {Time limit Exceeded}
            //     }  
            //     if(count == 2)
            //     {
            //         System.out.println("prime ");
            //     }
            //     else
            //     {
            //         System.out.println("not prime ");
            //     }

//  <------------------------> second Method <-------------------------->

            // {
            //     int n = scn.nextInt();

            //     int count = 0;
            //     for(int div = 2;div*div <=n; div++)
            //     {
            //         if(n % div == 0)
            //         {
            //             count++;
            //         }
            //     }                                       { Time limit Exceeded }
            //     if(count == 0)
            //     {
            //         System.out.println("prime ");
            //     }
            //     else
            //     {
            //         System.out.println("not prime ");
            //     }

//  <------------------------> fast Method <-------------------------->

            {
                int n = scn.nextInt();

                int count = 0;
                for(int div = 2;div*div <=n; div++)
                {
                    if(n % div == 0)
                    {
                        count++;
                        break;
                    }
                }  
                if(count == 0)
                {
                    System.out.println("Yes "+n+" is prime ");
                }
                else
                {
                    System.out.println("No "+n+" is not prime ");
                }
            }
        }
    }
}