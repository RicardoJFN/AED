package aula02.exercicio04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMatrix {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\José Germano\\Desktop\\Ficheiros\\matrix.txt";
        File file = new File(filePath);
        Scanner stdin = null;

        try {
            stdin = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // Inserir uma matriz manualmente
        //Scanner stdin = new Scanner(System.in);

        Matrix m = new Matrix(stdin.nextInt(), stdin.nextInt());

        LibMatrix.read(m, stdin);

        System.out.println(LibMatrix.toString(LibMatrix.transpose(m)));


        // Comando de excepão
        //throw new RuntimeException("My very first custom error.");
    }

}
