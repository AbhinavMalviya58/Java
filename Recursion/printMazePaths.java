public class printMazePaths {
    public static void mazePaths(int startH, int startV, int endH, int endV, String psf){
    
        for(int ms = 1 ; ms <= endH - startH; ms++){
            mazePaths(startH, startV, endH, endV, "H");
        }
    }
    public static void main(String[] args){
        mazePaths(0, 0, 4, 4, null);
    }
}



