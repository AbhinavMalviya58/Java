public class N_natural_numbers_reverse_order {
    static void reverseOrder(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        reverseOrder(n-1);
    }
    public static void main(String[] args){
        reverseOrder(5);
    }
}
