package aula01;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String teste = sc.next();
        System.out.println("Numero de argumentos: " + teste.length());
    }
}


