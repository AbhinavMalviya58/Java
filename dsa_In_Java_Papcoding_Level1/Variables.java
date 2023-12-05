public class Variables{
    public static void main(String args[])
    {
        // sum
        int x=15;
        int y=5;
        int sum = x + y;
        System.out.println("Sum of "+x+" and "+y+" is "+sum);
        // x*y
        int prd = x * y;
        System.out.println("product of "+x+" and "+y+" is "+prd);
        // x/y,y/x,x%y
        int v1 = x/y;
        int v2 = y/x;
        int v3 = x%y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        // exp
        int exp = (x-y)/(x+y);
        System.out.println(exp);
    }
}