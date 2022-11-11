package arrays_e_collections.array;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota;
        double soma = 0;

        System.out.print("Quantas notas você deseja inserir: ");
        int qtdNotas = entrada.nextInt();

        ArrayList<Double> notas = new ArrayList<>(qtdNotas);

        for (int i = 0; i<qtdNotas; i++){
            System.out.print("Digite a nota " + (i+1) + ": ");
            nota = entrada.nextDouble();
            notas.add(nota);
        }

        for (Double n: notas) {
            soma+=n;
        }

        System.out.print("Média = " + (soma/qtdNotas));

        entrada.close();
    }
}
