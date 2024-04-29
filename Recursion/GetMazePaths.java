import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    static ArrayList<String> getMaze (int sh, int sv, int eh, int ev){
        if(sh == eh && sv == ev){
            ArrayList<String> Base = new ArrayList<>();
            Base.add("");
            return Base;
        }
        
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sh < eh){
            hpaths = getMaze(sh + 1, sv, eh, ev);
        }
        if(sv < ev){
            vpaths =  getMaze(sh, sv + 1, eh, ev);
        }

        ArrayList<String> paths = new ArrayList<>();
        for(String h: hpaths){
            paths.add("h" + h);
        }
        for(String v: vpaths){
            paths.add("v" + v);
        }
        return paths;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int v = scn.nextInt();
        scn.close();
        ArrayList <String> ans = getMaze(1, 1, h, v);
        System.out.println(ans);
    }
}