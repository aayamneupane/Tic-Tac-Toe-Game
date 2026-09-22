
import java.util.Scanner;

// This is the Main file for Java Tic-Tac-Toe Game.

public class Main{
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '}, 
            {' ', ' ', ' '}, 
            {' ', ' ', ' '}
        };

        updateBoard(board);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to play? (1-9)");
        String userInput = scanner.nextLine();

        System.out.println(userInput);

        switch (userInput) {
            case "1":
                board[0][0] = 'X';
                break;
            
            case "2":
                board[0][1] = 'X';
                break;
            
            case "3":
                board[0][2] = 'X';
                break;

            case "4":
                board[1][0] = 'X';
                break;

            case "5":
                board[1][1] = 'X';
                break;

            case "6":
                board[1][2] = 'X';
                break;

            case "7":
                board[2][0] = 'X';
                break;

            case "8":
                board[2][1] = 'X';
                break;

            case "9":
                board[2][2] = 'X';
                break;
            default:
                System.out.println("I am sad");
        }

        updateBoard(board);


        

    }
    
    private static void updateBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        // System.out.println("-+-+-"); not needed
    }
}