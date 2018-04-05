package aula02.TicTacToe;

import aula02.exercicio04.LibMatrix;
import aula02.exercicio04.Matrix;

import java.util.ArrayList;
import java.util.Random;
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
        /*char move = scanner.next().charAt(0);

        board[0][0] = move;




        System.out.println("");*/


        /*
        First approach in generating player and ai moves to the board.
        Next stop:
            - Generate a game with a number of plays in order to get a full game
        */
        double aiPlay = Math.random();

        if (aiPlay > 0.5)
            aiPlay = 1;



        for (int i = 0; i != 9; i++){
            System.out.println("Introduz a tua jogada dizendo a posição que queres: ");
            int coordRow = scanner.nextInt();
            int coordColumn = scanner.nextInt();

            board[coordRow][coordColumn] = 'X';

            int[] playerMoves = new int[2];
            playerMoves[0] = coordRow;
            playerMoves[1] = coordColumn;
        }




        int[] saves = new int[3];




        for(int i = 0; i != board.length; i++)
            System.out.println(board[i]);


        int aiRowPlay = (int) (Math.random() * 2);
        int aiColumnPlay = (int) (Math.random() * 2);

        if (board[aiRowPlay][aiColumnPlay] != 'X')
            board[aiRowPlay][aiColumnPlay] = 'O';
        else {
            aiRowPlay = (int) (Math.random() * 2);
            aiColumnPlay = (int) (Math.random() * 2);
            board[aiRowPlay][aiColumnPlay] = 'O';
        }




        for(int i = 0; i != board.length; i++)
            System.out.println(board[i]);



        /*
        Guardar a jogada(coordenadas) numa lista. Se as posições da lista forem seguidas então o jogo terminou.
        */





    }
}
