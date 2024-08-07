/**
 * maxProfit Knapsack Recursive
 */
public class maxProfit {
    public static void main(String[] args) {
        // profit()

        int[] value = {60, 100, 120}; // Values of the items
        int[] wate = {10, 20, 30};   // Weights of the items
        int w = 50;                  // Capacity of the knapsack
        int n = value.length;        // Number of items

        maxProfit knapsack = new maxProfit();
        int maxProfit = knapsack.profit(value, wate, w, n);
        System.out.println("Maximum profit: " + maxProfit);
    }
    
    int profit(int value[], int wate[], int w, int n){
        /*
            item1 = w1 
            w1 <= w ,  include in bag // or // not include in bag
            w1 > w      not include in bag

            Initializes the value and wate arrays representing the values and weights of the items.
            Sets the capacity of the knapsack (w).
            Determines the number of items (n).
            Creates an instance of the Knapsack class.
            Calls the profit method with the specified arguments and prints the result.
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
