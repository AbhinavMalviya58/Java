import java.util.*;
public class GetKeypadCombination {
    static String[] code = {",;","abc" ,"def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    static ArrayList<String> getKeypad(String key){
        if(key.length()==0){
            ArrayList <String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = key.charAt(0);
        String Skey = key.substring(1);
        ArrayList<String> fath = getKeypad(Skey);
        
        ArrayList<String> newArr = new ArrayList<>();
        String codeForCh = code[ch - '0'];
        for(int i = 0;i<codeForCh.length();i++){
            char chCode = codeForCh.charAt(i);
            for(String n: fath){
                newArr.add(chCode+n);
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        ArrayList <String> ans = getKeypad("0123456789");
        System.out.println(ans);
    }
}
