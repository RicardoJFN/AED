package aula5.exercicio2;

import aula5.code3.LibLinkedList;
import aula5.code3.LinkedList;

public class LibAccount {


    public static void deposit (Account account, double valor){

        account.setSaldo(valor);
        account.setCountDeposit();
        LibLinkedList.addLast(account.getMovements(), valor);

    }

    public static String withdraw (Account account, double valor) {

        if (valor > account.getSaldo())
            throw new RuntimeException("Valor superior a saldo");

        account.setSaldo(account.getSaldo() - valor);
        account.setCoundWithdraw();
        LibLinkedList.addLast(account.getMovements(), valor);

        return "Levantamente feito";
    }

    public static void addInterest (Account account, int taxa) {

        double saldo = account.getSaldo();
        account.setTxJuro(taxa);
        double currentTax = account.getTxJuro();
        double total = saldo * currentTax;
        account.setSaldo(total);
    }

    public static String getMovements(Account account){
        return LibLinkedList.toString(account.getMovements());
        /*return "Número de movimentos de depósito " + account.getCountDeposit() +
                "\nNúmero de movimentos de withdraw " + account.getCoundWithdraw();*/
    }


    public static double getBalance (Account account) {

        double valor = account.getSaldo();
        return valor;
    }
}
