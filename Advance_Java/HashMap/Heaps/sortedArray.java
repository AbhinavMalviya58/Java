import java.util.*;

public class sortedArray {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = str.nextInt();
        }
        // int k = str.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
        }
        for(int i = n +1;i < arr.length;i++){
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }
        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }
    }
}
