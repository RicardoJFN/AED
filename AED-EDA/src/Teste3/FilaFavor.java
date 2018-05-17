package Teste3;

import aula06.code3.LibQueue;
import aula06.code3.Queue;

import javax.management.Query;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilaFavor {
    public static void main(String[] args) {
        ArrayList<Queue<String>> list = new ArrayList<>();


        Scanner in = new Scanner(System.in);
        int input = 0;
        String operacao = "";

        while (input != 5){
            input = in.nextInt();
            if (input == 1){
                input = in.nextInt();

                if (input <= 2){
                    for (int i = 0; i != input; i++){
                        Queue<String> fila = new Queue<>();
                        list.add(fila);
                    }

                }

                operacao = in.next();
                if (operacao.equals("ADD")){

                }



            }
        }
    }


    public static void ADD(String nome, Queue<String> q){
        LibQueue.add(q,nome);
    }

    public static void REMOVE(Queue<String> q){
        if (LibQueue.size(q) != 0)
            LibQueue.remove(q);
    }

    public static void MIN(String nome){
        //for (int i = 0; i != )
    }

    public static void SHOW(ArrayList<Queue<String>> list){

    }
}
