import java.util.Scanner;

public class ConnectFour {

    public static final int ROWS = 6;
    public static final int COLS = 7;
    public static char[][] board = new char[ROWS][COLS];
    public static char currentPlayer = 'R';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        while (true) {
            int column = getPlayerMove();
            if (makeMove(column)) {
                printBoard();
                if (isWinningMove(column)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                currentPlayer = (currentPlayer == 'R') ? 'Y' : 'R';
            } else {
                System.out.println("Column full or invalid. Try again.");
            }
        }
    }

    public static void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = '.';
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("0 1 2 3 4 5 6"); // column numbers
    }

    public static int getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int column;
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter column (0-6):");
            column = scanner.nextInt();
            if (column >= 0 && column < COLS) {
                break;
            } else {
                System.out.println("Invalid column. Try again.");
            }
        }
        return column;
    }

    public static boolean makeMove(int column) {
        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][column] == '.') {
                board[row][column] = currentPlayer;
                return true;
            }
        }
        return false;
    }

    public static boolean isWinningMove(int column) {
        int row = findRowForColumn(column);
        return (checkDirection(row, column, 1, 0) || // Horizontal
                checkDirection(row, column, 0, 1) || // Vertical
                checkDirection(row, column, 1, 1) || // Diagonal /
                checkDirection(row, column, 1, -1));  // Diagonal \
    }

    public static int findRowForColumn(int column) {
        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][column] != '.') {
                return row;
            }
        }
        return -1; // Column is empty
    }

    public static boolean checkDirection(int row, int col, int rowDir, int colDir) {
        int count = 0;
        for (int i = -3; i <= 3; i++) {
            int r = row + i * rowDir;
            int c = col + i * colDir;
            if (r >= 0 && r < ROWS && c >= 0 && c < COLS && board[r][c] == currentPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
