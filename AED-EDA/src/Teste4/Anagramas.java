package Teste4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Anagramas {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "C:\\Users\\admin\\Desktop\\Teste4.txt";
        ArrayList<String> text = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))){
            while(scanner.hasNext()){
                text.add(scanner.next());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        int count0 = 0, count1 = 0, count2 = 0;
        String[] arrayAnagram = new String[] {"caras", "cama", "fio"};

        for (int i = 0; i != text.size(); i++){
            String word = text.get(i).replaceAll("[^a-zA-Z ]", "");
            if (word.equals(arrayAnagram[0]) && count0 == 0)
                count0++;
            if (word.equals(arrayAnagram[1]) && count1 == 0)
                count1++;
            if (word.equals(arrayAnagram[2]) && count2 == 0)
                count2++;
        }


        System.out.println(count0 + count1 + count2);
    }
}
