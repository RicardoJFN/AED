package aula02.exercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\admin\\Documents\\hamlet.txt";
        File file = new File(filePath);
        Scanner stdin = null;

        try {
            stdin = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int counter = 0;

        while (stdin.hasNext()) {
            counter++;

            String s = stdin.next();
            System.out.println(counter + ": " + s);
        }
    }
}
