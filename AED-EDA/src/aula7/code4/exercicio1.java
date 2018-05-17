package aula7.code4;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int max = input.nextInt();
        Integer[] ints = new Integer[max];
        for (int i = 0; i != ints.length; i++){
            ints[i] = input.nextInt();
        }

        System.out.println("Antes da ordenação: ");
        for (int value: ints) {
            System.out.println(value);
        }

        SortingSearching.bubbleSort0(ints);

        System.out.println("Depois de ordenação: ");
        for (int value: ints) {
            System.out.println(value);
        }

    }
}
