package aula7.code4;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = input.nextInt();
        String[] names = new String[max];
        for (int i = 0; i != names.length; i++){
            names[i] = input.next();
        }

        System.out.println("Antes da ordenação: ");
        for (String value: names) {
            System.out.println(value);
        }

        SortingSearching.bubbleSort0(names);

        System.out.println("Depois de ordenação: ");
        for (String value: names) {
            System.out.println(value);
        }

    }
}
