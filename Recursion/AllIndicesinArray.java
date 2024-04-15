public class AllIndicesinArray {
    static int  allIndex(int a[], int idx, int data){
        if(idx == a.length){
            return -1;
        }
        int index = allIndex(a, idx+1, data);
    }
    public static void main(String[] args) {
        int[] num = {3,4,5,3,2,3,};
        int ans = allIndex(num, 0, 3);
        System.out.println(ans);
    }
}
