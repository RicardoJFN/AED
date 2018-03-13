package aula02.TicTacToe;

import aula02.exercicio04.LibMatrix;
import aula02.exercicio04.Matrix;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        Create a board with 3x3 matrix;
         */
        char[][] board = new char[3][3];


        System.out.println("Jogo do Galo!");

        /*
        Clear the board to start a new one.
        The '-' is there in order to fill the matrix, waiting for the input to be replaced.
         */
        for (int i = 0; i != 3; i++)
            for (int j = 0; j != 3; j++)
                board[i][j] = '-';

        /*
        Testing purpose (Check the new board created)
         */
        for(int i = 0; i != board.length; i++)
            System.out.println(board[i]);

        /*
        The following lines of code is there in order to test the input in the
        board and print it to the user.
         */
        char move = scanner.next().charAt(0);

        board[0][0] = move;

        for(int i = 0; i != board.length; i++)
            System.out.println(board[i]);


        System.out.println("");


    }
}
