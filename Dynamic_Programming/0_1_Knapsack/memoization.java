
public class memoization {
    // public static void main(String args[]) {

    //     int[] value = { 60, 100, 120 }; // Values of the items
    //     int[] wate = { 10, 20, 30 }; // Weights of the items
    //     int w = 50; // Capacity of the knapsack
    //     int n = value.length; // Number of items

    //     maxProfit knapsack = new maxProfit();
    //     int maxProfit = knapsack.profit(value, wate, w, n);n
    //     System.out.println("Maximum profit: " + maxProfit);
    // }

    int maxProfitmemoizetion(int value[], int wate[], int w, int n, int[][] memo) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (memo[w][n] != -1) {
            return memo[w][n];
        }
        
        // choice condition
        if (wate[n - 1] <= w) {
            return memo[w][n] =  Math.max(value[n - 1] + maxProfitmemoizetion(value, wate, w - wate[n - 1], n - 1, memo),
                    maxProfitmemoizetion(value, wate, w, n - 1, memo));
        } else {
            return memo[w][n] =  maxProfitmemoizetion(value, wate, w, n - 1, memo);
        }
    }
}