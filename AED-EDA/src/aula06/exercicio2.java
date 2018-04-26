package aula06;

import aula06.code3.LibStack;
import aula06.code3.Stack;

public class exercicio2 {
    public static void main(String[] args) {

        int n = 5;
        Stack<Integer> s = new Stack<Integer>();


         while (n > 0) {
            int valor = (n % 2);
            n = n / 2;
            LibStack.push(s, valor);
            
        }

        System.out.println(LibStack.toString(s));
    }

}
