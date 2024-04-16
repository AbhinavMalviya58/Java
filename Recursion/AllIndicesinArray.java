public class AllIndicesinArray {
    static int[]  allIndex(int a[], int idx, int data,int fsf){
        if(idx == a.length){
            return new int[fsf];
        }
        if(a[idx]==data){
            int[] index = allIndex(a, idx+1, data, fsf + 1);
            index[fsf] = idx;
            return index; 
        }else{
            int[] index = allIndex(a, idx+1, data, fsf);
            return index;
        }
    }
    public static void main(String[] args) {
        int[] num = {3,4,5,3,2,3,};
        int[] ans = allIndex(num, 0, 3,0);
        if(ans.length == 0){
            System.out.println();
            return;
        }
        for(int i = 0;i<=ans.length-1;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
