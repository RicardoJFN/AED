package aula02.TicTacToe;

import aula02.exercicio04.LibMatrix;
import aula02.exercicio04.Matrix;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Matrix matrix = new Matrix(3,3);
        char[][] table = new char[3][3];


        System.out.println("Jogo do Galo!" + "\n" +
                            "Tecla 1 = X, tecla 0 = O");

//        int jogada = scanner.nextInt();

        for (int i = 0; i != 3; i++)
            for (int j = 0; j != 3; j++)
                table[i][j] = '-';

        for(int i = 0; i != table.length; i++)
            System.out.println(table[i]);






    }
}
