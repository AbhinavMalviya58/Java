import java.util.*;

public class floodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int R = scn.nextInt();
        int C = scn.nextInt();
        int[][] arr = new int[R][C];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[R][C];
        flood(arr, 0, 0, "", visited);
    }
    public static void flood(int[][] arr, int row, int col, String ans, boolean[][] visited) {
        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length ||
        arr[row][col] == 1 || visited[row][col] == true) {
            return;
        }
        if(row == arr.length - 1 && col == arr[0].length -1){
            System.out.println(ans);
            return;
        }
        visited[row][col] = true;
        flood(arr, row - 1, col, ans + "t", visited);
        flood(arr, row, col - 1, ans + "l", visited);
        flood(arr, row + 1, col, ans + "d", visited);
        flood(arr, row, col + 1, ans + "r", visited);
        visited[row][col] = false;
    }
}
