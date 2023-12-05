import java.util.Scanner;

public class TakeInput {
        public static void main(String[] args)
        {
        Scanner scn = new Scanner(System.in);
//       <---------------------> Number <------------------------------>

        // int n = scn.nextInt();
        // scn.close();
        // for(int i = 0; i<= n; i++)
        // {
        //     System.out.println(i);
        // }

//        <---------------------> Streng <------------------------------>

        // String name =  scn.nextLine();
        // scn.close();
        // System.out.println("Hello "+name);

//        <---------------------> Number and Streng <------------------------------>

        System.out.print("Enter your counting = ");
        int n = Integer.parseInt(scn.nextLine());
        System.out.print("Enter your name = ");
        String name = scn.nextLine();
        scn.close();
        System.out.println("Dear " + name + " hear is the counting ");
        for(int i = 1; i <= n; i++)
        {
                System.out.println(i);
        }
        }
}
