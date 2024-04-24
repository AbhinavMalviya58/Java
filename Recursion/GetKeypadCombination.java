import java.util.*;
public class GetKeypadCombination {
    String[] code = {"abc" ,"def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
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
        for(String i: fath){
            newArr.add(" "+i);
        }
        for(String i:fath){
            newArr.add(ch+i);
        }
        return newArr;
    }
    public static void main(String[] args) {
        ArrayList <String> ans = getKeypad("123");
        System.out.println(ans);
    }
}
