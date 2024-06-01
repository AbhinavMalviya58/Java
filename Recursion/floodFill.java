import java.util.*;

public class floodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter row ");
        int R = scn.nextInt();
        System.out.print("Enter column ");
        int C = scn.nextInt();
        int[][] arr = new int[R][C];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[R][C];
        flood(arr, 0, 0, "", visited);
        int path = shortPathFlood(arr, 0, 0, 4, 4, visited);
        System.out.println(path);
    }

    public static void flood(int[][] arr, int row, int col, String ans, boolean[][] visited) {
        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length ||
                arr[row][col] == 1 || visited[row][col] == true) {
            return;
        }
        if (row == arr.length - 1 && col == arr[0].length - 1) {
            System.out.println(ans);
            return;
        }

        // arrayLiat

        visited[row][col] = true;
        flood(arr, row - 1, col, ans + "t", visited);
        flood(arr, row, col - 1, ans + "l", visited);
        flood(arr, row + 1, col, ans + "d", visited);
        flood(arr, row, col + 1, ans + "r", visited);
        visited[row][col] = false;
    }

    public static int shortPathFlood(int[][] arr , int row, int col, int x, int y, boolean[][] visited){
        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length ||
        arr[row][col] == 1 || visited[row][col] == true) {
            return 0;
        }
        if(row == arr.length && col == arr[0].length){
            return 0;
        }
        visited[row][col] = true;
        int top = shortPathFlood(arr, row - 1, col, x, y, visited) + 1;
        int left = shortPathFlood(arr, row, col - 1, x, y, visited) + 1;
        int doun = shortPathFlood(arr, row + 1, col, x, y, visited) + 1;
        int right = shortPathFlood(arr, row, col + 1, x, y, visited) + 1;
        visited[row][col] = false;
        return Math.min(Math.min(top, left), Math.min(doun, right));
    }
}
