import java.util.*;

public class lergestElement {
    public static void main(String [] args){
        Scanner str = new Scanner(System.in);
        System.out.println("enter element");
        int number = str.nextInt();
        int[] arr = new int[number];
        for(int i = 0;i < arr.length;i++){
            arr[i] = str.nextInt();     
        }
        System.out.println("enter K element");
        int k = str.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i < number;i++){
            if(i < k){
                pq.add(arr[i]);
            }else{
                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }
        
    }
}
