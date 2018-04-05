package Teste2;

import java.util.Scanner;

public class MainTester {
    public static void main(String[] args) {
        Account a = new Account();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++) {
            String op = in.next();
            if (op.equals("depositar")) LibAccount.deposit(a, in.nextDouble());
            else if (op.equals("levantar")) LibAccount.withdraw(a, in.nextDouble());
        }
        LibAccount.getMovements(a);
    }

}
