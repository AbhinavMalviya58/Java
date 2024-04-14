import java.util.*;
public class displayAnArray {
    static void Array(int a[], int index) {
        if(index == a.length)
        return;
        System.out.println(a[index]);
        Array(a, index+1);
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        Array(a,0);
    }
}
