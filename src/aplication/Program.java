package aplication;
import entities.Estudante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Estudante> estudantes = new ArrayList<>();

        System.out.print("Quantos estudantes? ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Número deve ser posotivo!");
            return;
        }

        for (int i=0; i<n; i++){
            System.out.println("\nEstudante #" + (i + 1));
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();

            estudantes.add(new Estudante(nome, nota1, nota2));
        }

        System.out.println("\nEstudantes aprovados: ");
        int contador = 0;
        for (Estudante estudante : estudantes) {
            if (estudante.aprovado()){
                System.out.print(estudante);
                contador++;
            }
        }

        System.out.println("\nTotal de aprovados: " + contador);

        sc.close();
    }
}