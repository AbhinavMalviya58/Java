public class printStairsPath {
    
    public static void printStairs(int stair, String path){
        if(stair < 0){
            return;
        }
        if(stair == 0){
            System.out.println(path+" ");
            return;
        }

        printStairs(stair - 1, path + "1");
        printStairs(stair - 2, path + "2");
        printStairs(stair - 3, path + "3");
    }
    public static void main(String[] args) {
        printStairs(10 ," ");
    }
}
