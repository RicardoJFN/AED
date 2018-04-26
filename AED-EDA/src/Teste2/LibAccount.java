package Teste2;

import aula5.code3.LibLinkedList;
import aula5.code3.LinkedList;

public class LibAccount {

    public static void deposit(Account a, double m){
        a.balance += m;
        LibLinkedList.addLast(a.movements, m);

    }

    public static void withdraw(Account a, double m){
        a.balance -= m;
        LibLinkedList.addLast(a.movements, -m);

    }

    public static void getMovements(Account account){

        System.out.println("Saldo: " + account.balance + "\n" +
                            "Número de movimentos: " + LibLinkedList.size(account.movements));

        double x = 0;
        for (int i = 0; i != LibLinkedList.size(account.movements); i++){
            x += LibLinkedList.get(account.movements, i);
            System.out.println(LibLinkedList.get(account.movements, i) + " -> " + x);
        }

    }

}
