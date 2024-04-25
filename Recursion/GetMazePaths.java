public class GetMazePaths {
    static ArrayList<String> getMaze (int s1, int s2, int e1, int e2){

        ArrayList<String> paths1 =  getMaze(s1 + 1, s2, e1, e2);
        ArrayList<String> paths2 =  getMaze(s1, s2 + 1, e1, e2);
    }
}