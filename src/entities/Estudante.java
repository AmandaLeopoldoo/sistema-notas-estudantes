package entities;

public class Estudante {
    private String nome;
    private double nota1;
    private  double nota2;

    public Estudante(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public boolean aprovado() {
        return calcularMedia() >= 6.0;
    }

    @Override
    public String toString() {
        return String.format("%s - Média: %.2f%n", nome, calcularMedia());
    }
}
