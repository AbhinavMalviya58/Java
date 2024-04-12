
public class powerLInear {
    static int powerLinear(int n , int x){
        if(x==0)
        return 1;
        int s = n*powerLinear(n, x-1);
        return s;
        
    }
    public static void main(String[] args) {
        int n = powerLinear(2, 0);
        System.out.println(n);
    }
} 
