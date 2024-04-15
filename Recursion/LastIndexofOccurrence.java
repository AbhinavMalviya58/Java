public class LastIndexofOccurrence {
    static int lastIndex(int[] arr, int idx, int data){
        if(idx == arr.length){
            return -1;
        }
        int index = lastIndex(arr, idx + 1, data);
        if(index == -1){
            if(arr[idx] == data){
                return idx;
            }else{
                return -1;
            }
        }else{
            return index;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,6,3,6,7};
        int ans = lastIndex(a, 0, 6);
        System.out.println(ans);
    }
}
