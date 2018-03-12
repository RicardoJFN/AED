package aula02.exercicio03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {

        int s = 0;

        String filePath = "C:\\Users\\admin\\Documents\\numbers.txt";
        File file = new File(filePath);
        Scanner stdin = null;

        try {
            stdin = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int x = stdin.nextInt();

        int v[] = new int [x];

        //int n = stdin.nextInt();

        for (int i=0; i<x; i++)
            v[i] = stdin.nextInt();

        for (int i=0; i<x; i++)
            System.out.println("v[" + (i+1) + "] = " + v[i]);

        for (int i=0; i<v.length; i++)
            s += v[i];

        System.out.println("Soma = " + s);

        System.out.println("Média = " + s/v.length);


        int m = 0;
        int n = v[0];
        for (int i=0; i<v.length ; i++){
            if ( m < v[i])
                m = v[i];
            else if(n > v[i])
                n = v[i];
        }

        System.out.println("Diferenca= " + (m-n));
    }
}
