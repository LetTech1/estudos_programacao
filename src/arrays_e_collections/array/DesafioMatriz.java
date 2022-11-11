package arrays_e_collections.array;

import java.util.Scanner;

public class DesafioMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = 0;

        System.out.print("Quantos alunos tem na turma: ");
        int alunos = entrada.nextInt();

        System.out.print("Quantas notas cada aluno tem: ");
        int qtdNotas = entrada.nextInt();

        double[][] notas = new double[alunos][qtdNotas];

        for (int i = 0; i<alunos; i++){
            System.out.println("Digite as notas do aluno " + i);
            for (int j = 0; j<qtdNotas; j++){
                System.out.print("Digite a nota " + ": ");
                nota = entrada.nextDouble();
                notas[i][j] = nota;
            }
        }

        for (int i = 0; i<alunos; i++){
            System.out.println("Aluno " + (i+1));
            for (int j = 0; j<qtdNotas; j++){
                System.out.println("Nota " + (j+1) + ": " + notas[i][j]);
            }
        }
        entrada.close();
    }
}
