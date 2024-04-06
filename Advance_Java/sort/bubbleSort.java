package sort;

public class bubbleSort {
    int[] n = { 2, 4, 1, 3, 5 };
    int sum = 0;
    int tamp = 0;
    for(int i = 0;i<n.length-1;i++){
        for (int j = 0; j < n.length - i - 1; j++) {
            if (n[j + 1] < n[j]) {
                tamp = n[i];
                n[i] = n[j];
                n[j] = tamp;
            }
            System.out.print(tamp);
        }
        sum = sum + n[i];
        // System.out.print(n[i]+" , ");
    }
    System.out.println("\n"+sum+" is sum of n");
}
