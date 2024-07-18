/**
 * maxProfit Knapsack Recursive
 */
import java.util.*;
import java.math.*;
public class maxProfit {
    public static void main(String[] args) {
        // profit()
    }

    int profit(int value[], int wate[], int w, int n){
        /*
            item1 = w1 
            w1 <= w ,  include in bag // or // not include in bag
            w1 > w      not include in bag
         */
        
        // base condition
        if (n == 0  || w == 0) {
            return 0;
        }
        // choice condition
        if(wate[n-1] <= w){
            return Math.max(value[n - 1] + profit(value, wate, w - wate[n - 1], n - 1) , profit(value, wate, w, n - 1));
        }else{
            return profit(value, wate, w, n - 1);
        }
    }
}
