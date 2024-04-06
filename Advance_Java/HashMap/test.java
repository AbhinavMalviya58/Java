import java.util.*;
import java.io.*;
import java.lang.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t % 2)
        System.out.println("mess = "+t);
        // int n;
        // while (t-- > 0) {
        //     n = sc.nextInt();
        //     Solution obj = new Solution();
        //     for (int i = 1; i <= n; i++) {
        //         int x = sc.nextInt();
        //         obj.insertHeap(x);
        //         System.out.println((int) Math.floor(obj.getMedian()));
        //     }
        // }
    }
}

// } Driver Code Ends
class Solution {
    static PriorityQueue<Integer> left = new PriorityQueue<>();
    static PriorityQueue<Integer> right = new PriorityQueue<>(Collections.reverseOrder());

    // Function to insert heap.
    public static void insertHeap(int x) {
        // add your code here
        if(left.isEmpty() || x <= left.peek()){
            left.add(x);
        }else{
            right.add(x);
        }
        balanceHeaps();
    }

    // Function to balance heaps.
    public static void balanceHeaps() {
        // add your code here
        if(left.size()<right.size()){
            left.add(right.poll());
        }else if(left.size()>right.size()){
            right.add(left.poll());
        }
    }

    // Function to return Median.
    public static double getMedian() {
        // add your code here
        if (left.size() == right.size()) {
            return ((left.peek() + right.peek()) / 2.0);
        } else {
            return left.peek();
        }
    }
}