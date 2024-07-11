/**
 * maxProfit Knapsack Recursive
 */
public class maxProfit {

    static int profit(int[] value, int[] price, int wate, int arrSize){
        if(arrSize){
            return 0;
        }
        profit(value, price, wate, arrSize);
    }
}
