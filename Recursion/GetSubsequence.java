import java.util.*;
public class GetSubsequence {
    static ArrayList<String> Subsequence(String str){
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }   

        char ch = str.charAt(0);//a
        String sub = str.substring(1);//bc
        ArrayList<String> fath = Subsequence(sub);

        ArrayList<String> newArr = new ArrayList<>();
        for(String n : fath){
            newArr.add("_"+n);
        }
        for(String n : fath){
            newArr.add(ch+n);
        }
        return newArr;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = Subsequence("abc");
        System.out.println(ans);
    }
}
