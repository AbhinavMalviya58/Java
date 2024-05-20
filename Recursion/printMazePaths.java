public class printMazePaths {
    public static void mazePaths(int startR, int startC, int endR, int endC, String psf){
        if(startR == endR && startC == endC){
            System.out.print(psf);
            return;
        }
    
        for(int ms = 1 ; ms <= endR - startR; ms++){
            mazePaths(startR + ms, startC, endR, endC, psf + "H" + ms);
        }
        for(int ms = 1 ; ms <= endC - startC; ms++){
            mazePaths(startR, startC + ms, endR, endC, psf + "V" + ms);
        }
        for(int ms = 1; ms <= endR - startR && ms <= endC - startC; ms++){
            mazePaths(startR + ms, startC + ms, endR, endC, psf + "D" + ms);
        }
    }
    public static void main(String[] args){
        mazePaths(0, 0, 3, 3, " ");
    }
}



