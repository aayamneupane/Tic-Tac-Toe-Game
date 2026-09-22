// This is the Main file for Java Tic-Tac-Toe Game.

public class Main{
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '}, 
            {' ', ' ', ' '}, 
            {' ', ' ', ' '}
        };

        generateBoard(board);
        // System.out.println("-+-+-"); not needed
    }

    private static void generateBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}