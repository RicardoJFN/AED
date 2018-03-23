package aula03.exerc1;

public class MainTester {

    public static void main(String[] args) {

        Account a1 = new Account();

        Account a2 = new Account(100.00, 25);


        LibAccount.deposit(a1, 50);

        LibAccount.withdraw(a2, 30);

        System.out.println(LibAccount.withdraw(a1, 30));

        LibAccount.addInterest(a1, 15);

        System.out.println("Conta 1: " + LibAccount.getBalance(a1) + "\nConta 2: " +
                LibAccount.getBalance(a2));

        System.out.println("Conta 1: " + LibAccount.getMovements(a1) + "\nConta 2: " +
                LibAccount.getMovements(a2));
    }

}
