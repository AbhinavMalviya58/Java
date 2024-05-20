import java.util.Scanner;

public class printPermutations {
    public static void main(String [] args){
        // Scanner scr = new Scanner(System.in);
        // String str = scr.next();
        // scr.close();
        Permutations("abc", "");
    }

    public static void Permutations(String ques, String asf){
        if(ques.length() == 0){
            System.out.println(asf);
            return;
        } 
        for(int i = 0; i < ques.length(); i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0, i);
            String qrpart = ques.substring(i + 1);
            String roq = qlpart + qrpart;
            Permutations(roq, asf + ch);
        }
    }
}
