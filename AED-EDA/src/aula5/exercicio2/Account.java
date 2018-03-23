package aula5.exercicio2;

import aula5.code3.LinkedList;

public class Account {

    private double saldo;
    private int txJuro;
    private int countDeposit;
    private int coundWithdraw;
    private LinkedList<Double> movements;

    public Account (){

        this.saldo = 0;
        this.txJuro = 0;
        this.coundWithdraw = 0;
        this.countDeposit = 0;
        this.movements = new LinkedList<>();
    }

    public Account(double saldo, int juro){
        this.saldo = saldo;
        this.txJuro = juro;
        this.coundWithdraw = 0;
        this.countDeposit = 0;
        this.movements = new LinkedList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTxJuro() {
        return this.txJuro / 100;
    }

    public void setTxJuro(int txJuro) {
        this.txJuro = txJuro;
    }

    public int getCountDeposit() {
        return countDeposit;
    }

    public void setCountDeposit() {
        this.countDeposit += 1;
    }

    public int getCoundWithdraw() {
        return coundWithdraw;
    }

    public void setCoundWithdraw() {
        this.coundWithdraw += 1;
    }

    public LinkedList<Double> getMovements() {
        return movements;
    }

    public void setMovements(LinkedList<Double> movements) {
        this.movements = movements;
    }

    /*public void addMovement(double valor){

        for (int i = 0; i != this.trans.length; i++){
            if (this.trans[i] == 0)
                this.trans[i] = valor;
            break;
        }
    }*/
}
