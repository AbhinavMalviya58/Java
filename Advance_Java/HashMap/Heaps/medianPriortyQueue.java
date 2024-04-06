import java.util.*;

public class medianPriortyQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> = left;
        PriorityQueue<Integer> = right;
        public medianPriortyQueue(){
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }
        public void add(int val){
            if(right.size() > 0 && val < right.peek()){
                right.add(left.remove());
            }else{
                left.add(val);
            }
            if(left.size() - right.size() == 2){
                right.add(left.remove());
            }else{
                left.add(right.remove());
            }
        }
        public int remove(){
            if(thus.Size() == 0){
                System.out.println("underflow");
                return -1;
            }else if(left.size() >= right.size()){
                return left.remove();
            }else{
                return right.remove();
            }
        }
        public int peek(){
            if(thus.Size() == 0){
                System.out.println("underflow");
                return -1;
            }else if(left.size() >= right.size()){
                return left.peek();
            }else{
                return right.peek();
            }
        }
        public int size(){
            return left.size() + right.Size() ;
        }
    }
}
