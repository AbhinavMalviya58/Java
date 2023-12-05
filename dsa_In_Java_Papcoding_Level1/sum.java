import java.util.Scanner;

class sum
{
    public static void main(String args[]) 
    {
        int x,y,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Fist Number");
        x= sc.nextInt();
        System.out.println("Enter a Scand Number");
        y= sc.nextInt();
        sc.close();
        sum = x+y;
        System.out.println("sum of x and y is = "+sum);
    }
}