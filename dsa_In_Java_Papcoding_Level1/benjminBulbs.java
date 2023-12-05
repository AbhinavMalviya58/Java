import java.util.Scanner;

// i have a 100 bulbs 
// int bulbs = 10;
public class benjminBulbs {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int voltageHits = sc.nextInt();
        for(int i = 1; i * i <= voltageHits; i++){
            System.out.println(i * i);
        }
        sc.close();
    }
}
