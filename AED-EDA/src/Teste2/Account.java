package Teste2;

import aula5.code3.LinkedList;

public class Account {

    double balance;
    LinkedList<Double> movements;


    public Account() {
        balance = 0;
        movements = new LinkedList<>();
    }

}
