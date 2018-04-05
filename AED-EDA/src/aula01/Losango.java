package aula01;

import java.util.Scanner;

public class Losango {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        int input = stdin.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < (input - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k < i; k++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = input - 1; i >= 1; i--) {
            for (int j = 0; j < (input - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k < i; k++)
                System.out.print("*");
            System.out.println();
        }


















    }

}
