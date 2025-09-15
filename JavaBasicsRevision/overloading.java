import java.util.Scanner;

public class overloading {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int x, y, z;
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println("Enter two doubles:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        int ans2 = sum(x, y);
        int ans = sum(x, y, z);
        System.out.println("Sum is: " + ans + "\nSum of two is: " + ans2);
        double ans3 = sum(a, b);
        System.out.println("sum of double is: " + ans3);
        scanner.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static double sum(double a, double b){
        return a + b;
    }
}
