/**
 * maxProfit Knapsack Recursive
 */
public class maxProfit {

    static int profit(int[] value, int[] price, int wate, int arrSize){
        if(arrSize == 0 || value == 0){
            return 0;
        }
        profit(value, price, wate, arrSize);
    }
}
