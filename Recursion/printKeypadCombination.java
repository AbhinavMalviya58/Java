public class printKeypadCombination {
    static String[] code = {" ",",;","abc" ,"def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static void printKeypad(String ques, String Ans){
        if(ques.length() == 0){
            System.out.print(Ans + " ");
            return;
        }
        
        char ch = ques.charAt(0);
        String str = ques.substring(1);

        String codeForCh = code[ch - '0'];

        for(int i = 0; i < codeForCh.length(); i++){
            char cho = codeForCh.charAt(i);
            printKeypad(str, Ans + cho);
        }
    }
    public static void main(String[] args) {
        String k = "23";
        printKeypad(k, "");
    }
}
