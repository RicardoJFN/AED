package aula03.exerc1;

public class Account {

    private double saldo;
    private int txJuro;
    private int countDeposit;
    private int coundWithdraw;
    private double trans[]=new double[10];

    public Account (){

        this.saldo = 0;
        this.txJuro = 0;
        this.coundWithdraw = 0;
        this.countDeposit = 0;

    }

    public Account(double saldo, int juro){
        this.saldo = saldo;
        this.txJuro = juro;
        this.coundWithdraw = 0;
        this.countDeposit = 0;
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

    /*public void addMovement(double valor){

        for (int i = 0; i != this.trans.length; i++){
            if (this.trans[i] == 0)
                this.trans[i] = valor;
            break;
        }
    }*/
}
