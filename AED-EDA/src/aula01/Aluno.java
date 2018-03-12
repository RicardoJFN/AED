package aula01;

public class Aluno {

    private String nome;
    private int numero;

    //Aluno() {
    //  nome = "indefinido";
    //   numero = -1;
    //  }
    public Aluno(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public Aluno(String nome){
        this.nome = nome;
        this.numero = 5;
    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
