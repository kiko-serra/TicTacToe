
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        printGameBoard(gameBoard);

        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Your turn! \nEnter position (1-9):");
            //System.out.println("Enter position (1-9):");
            int pos = scan.nextInt();

            placePiece(gameBoard, pos, "player");
            printGameBoard(gameBoard);

            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            placePiece(gameBoard, cpuPos, "computer");

            System.out.println("Computer turn");
            printGameBoard(gameBoard);
        }




    }

    public static void printGameBoard(char[][] gameBoard){
        for (char [] row : gameBoard){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] gameBoard, int pos, String user){
        char c= ' ';
        if (user.equals("player"))
            c='X';
        else if (user.equals("computer"))
            c='O';

        switch (pos) {
            case 1 -> gameBoard[0][0] = c;
            case 2 -> gameBoard[0][2] = c;
            case 3 -> gameBoard[0][4] = c;
            case 4 -> gameBoard[2][0] = c;
            case 5 -> gameBoard[2][2] = c;
            case 6 -> gameBoard[2][4] = c;
            case 7 -> gameBoard[4][0] = c;
            case 8 -> gameBoard[4][2] = c;
            case 9 -> gameBoard[4][4] = c;
            default -> {
            }
        }
    }
}
