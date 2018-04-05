package aula03.exerc1;

public class LibAccount {


    public static void deposit (Account account, int valor){

        account.setSaldo(valor);
        account.setCountDeposit();


    }

    public static String withdraw (Account account, int valor) {

        if (valor > account.getSaldo())
            throw new RuntimeException("Valor superior a saldo");

        account.setSaldo(account.getSaldo() - valor);
        account.setCoundWithdraw();

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
        return "Número de movimentos de depósito " + account.getCountDeposit() +
                "\nNúmero de movimentos de withdraw " + account.getCoundWithdraw();
    }


    public static double getBalance (Account account) {

        double valor = account.getSaldo();
        return valor;
    }
}
