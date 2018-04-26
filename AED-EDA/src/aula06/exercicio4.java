package aula06;

import java.util.Scanner;

import static aula06.code3.LibStack.balanced;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++){
            String s = in.next();
            System.out.println(s + ": " + balanced(s));
        }


    }
}
