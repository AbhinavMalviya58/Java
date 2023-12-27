import java.util.*;

public class Heaps {
    public static void main(String []args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // priority is long value
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(); // priority is short value
        int[] ranks = {3, 11, 35, 88 ,20, 34 ,60};
        for(int val: ranks){
            pq.add(val);
            pq2.add(val);
        }
        System.out.print("long to small = ");
        while(pq.size() > 0){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.print("\nsmall to long = ");
        while(pq2.size() > 0){
            System.out.print(pq2.peek()+" ");  
            pq2.remove();           
        }
    }
}
