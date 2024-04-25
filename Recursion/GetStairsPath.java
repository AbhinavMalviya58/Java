import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {
    static ArrayList <String> stairsPath(int getPath){
        if(getPath==0){
            ArrayList <String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if(getPath<0){
            ArrayList <String> base = new ArrayList<>();
            return base;
        }

        ArrayList <String> path1 = stairsPath(getPath - 1);
        ArrayList <String> path2 = stairsPath(getPath - 2);
        ArrayList <String> path3 = stairsPath(getPath - 3);
        ArrayList <String> paths = new ArrayList<>();
        for(String num: path1){
            paths.add(1+num);
        }
        for(String num: path2){
            paths.add(2+num);
        }
        for(String num: path3){
            paths.add(3+num);
        }
        return paths;
    } 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        ArrayList <String> Ans = stairsPath(n);
        System.out.println(Ans);
    }
}
