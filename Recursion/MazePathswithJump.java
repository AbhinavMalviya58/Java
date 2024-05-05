import java.util.ArrayList;

public class MazePathswithJump {
    static ArrayList<String> pathinjump(int sv, int sh, int ev, int eh){
        if(sv==ev && sh==eh){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> paths = new ArrayList<>();

        // horizontal move
        for(int mh = 1; mh <= eh - sh; mh++){
            ArrayList<String> hpaths = pathinjump(sv, sh + mh, ev, eh);
            for(String hpath: hpaths){
                paths.add("h" + mh + hpath);
            }
        }

        // vertical move
        for(int mv = 1; mv <= ev - sv; mv++){
            ArrayList<String> vpaths = pathinjump(sv + mv, sh, ev, eh);
            for(String vpath: vpaths){
                paths.add("v" + mv + vpath);
            }
        }

        // diagonal move
        for(int md = 1; md <= eh - sh && md <= ev - sv; md++){
            ArrayList<String> dpaths = pathinjump(sv + md, sh + md, ev, eh);
            for(String dpath: dpaths){
                paths.add("d" + md + dpath);
            }
        }
        return paths;
    }

    public static void main(String[] args) {
        ArrayList<String> Ans = pathinjump(1, 1, 3, 3);
        System.out.println(Ans);
    }
}