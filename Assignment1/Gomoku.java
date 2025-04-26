// Sujung Jang

import java.util.Scanner;
public class Gomoku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] array = new char[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                array[i][j] = '.';
            }
        }
        displayBoard(array);

        int currentPlayer = 1;
        while (true) {
            if (isBoardFull(array)) {
                System.out.println("The board is full!");
                break;
            }

            System.out.println("Player " + currentPlayer + "'s turn!");
            System.out.print("Enter row: ");
            int row = input.nextInt();
            System.out.print("Enter column: ");
            int column = input.nextInt();

            char stone = (currentPlayer == 1) ? '●' : '○';
            if (isValidMove(array, row, column)) {
                array[row][column] = stone;
                displayBoard(array);
                if (hasPlayerWon(array, currentPlayer)) {
                    System.out.println("Player" + currentPlayer + " wins!");
                    break;
                }
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }
    }

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(char[][] board, int row, int column) {
        if (row < 0 || row >= board.length || column < 0 || column >= board[0].length) {
            System.out.println("\nInvalid move! Try again!\n");
            return false;
        }
        if (board[row][column] != '.') {
            System.out.println("\nInvalid move! Try again!\n");
            return false;
        }
        return true;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasPlayerWon(char[][] board, int player) {
        return isHorizontalWin(board, player) || isVerticalWin(board, player) || isDiagonalWin(board, player);
    }

    public static boolean isHorizontalWin(char[][] board, int player) {
        char stone = (player == 1) ? '●' : '○';
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == stone) {
                    count++;
                    if (count == 5) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean isVerticalWin(char[][] board, int player) {
        char stone = (player == 1) ? '●' : '○';
        for (int j = 0; j < board[0].length; j++) {
            int count = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == stone) {
                    count++;
                    if (count == 5) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean isDiagonalWin(char[][] board, int player) {
        char stone = (player == 1) ? '●' : '○';
        for (int i = 0; i < board.length - 4; i++) {
            for (int j = 0; j < board[i].length - 4; j++) {
                if (board[i][j] == stone &&
                    board[i+1][j+1] == stone &&
                    board[i+2][j+2] == stone &&
                    board[i+3][j+3] == stone &&
                    board[i+4][j+4] == stone) {
                    return true;
                }
            }
        }

        for (int i = 4; i < board.length; i++) {
            for (int j = 0; j < board[i].length - 4; j++) {
                if (board[i][j] == stone &&
                    board[i-1][j-1] == stone &&
                    board[i-2][j-2] == stone &&
                    board[i-3][j-3] == stone &&
                    board[i-4][j-4] == stone) {
                    return true;
                }
            }
        }
        return false;
    }
}
