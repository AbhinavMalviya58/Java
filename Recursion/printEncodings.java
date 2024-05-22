import java.util.Scanner;

public class printEncodings {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        Encodings(str, "");
    }

    public static void Encodings(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans);
            return;
        }else if(str.length() == 1){
            char ch = str.charAt(0);
            if(ch == '0'){
                return;
            }else{
                
            }

        }
    }
}
