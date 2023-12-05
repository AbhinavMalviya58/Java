import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args)
    {
        float n1;
        float n2;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a first number");
            n1=sc.nextFloat();
            System.out.println("Enter a second number");
            n2=sc.nextFloat();
        sc.close();
        if(n1 == n2)
        {
            System.out.println(n1+ " is equal to " +n2 );
        }
        else if(n1 > n2)
        {
            System.out.println(n1+ " is greater then " +n2 );
        }
        else
        {
            System.out.println(n1+ " is smaller then " +n2 );
        }
    }
}
