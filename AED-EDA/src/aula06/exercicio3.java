package aula06;

import aula06.code3.LibStack;
import aula06.code3.Stack;

public class exercicio3 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();

        for (int i = 5; i != 0; i--){
            LibStack.push(s, i);
            System.out.println("Dentro do ciclo: " + LibStack.toString(s));
        }

        System.out.println("Antes do reverse: " + LibStack.toString(s));
        LibStack.reverse(s, 3);

        System.out.println("Depois do reverse: " + LibStack.toString(s));



    }

}
