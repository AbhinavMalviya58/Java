import java.util.*;

public class Heaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> left = new PriorityQueue<>(); // priority is long value
        PriorityQueue<Integer> right = new PriorityQueue<>(Collections.reverseOrder()); // priority is short value
        int[] ranks = { 3, 11, 35, 88, 20, 34, 60 };

        for(int val: ranks){
        left.add(val);
        right.add(val);
        }
        System.out.print("left = ");
        while(left.size() > 0){
        System.out.print(left.peek()+" ");
        left.remove();
        }
        System.out.print("\nright = ");
        while(right.size() > 0){
        System.out.print(right.peek()+" ");
        right.remove();
        }
    }
}
