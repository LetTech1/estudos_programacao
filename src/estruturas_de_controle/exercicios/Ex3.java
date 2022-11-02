package estruturas_de_controle.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*3. Criar um programa que receba duas notas parciais, calcular a média final.
        Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
        caso contrário imprime no console "Reprovado".*/

public class Ex3 {
    public static void main(String[] args) {
        double nota1 = 0;
        double nota2 = 0;
        double media;
        DecimalFormat df = new DecimalFormat("##,00");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        media = (nota1+nota2)/2;
        df.format(media);

        if(media >= 7.0 && media <= 10.0){
            System.out.print("A média é " + media + " e o aluno está APROVADO!");
        }else if(media > 4.0 && media < 7.0){
            System.out.print("A média é " + media + " e o aluno está de RECUPERAÇÃO!");
        }else if(media >= 0.0 && media <= 4.0){
            System.out.print("A média é " + media + " e o aluno está REPROVADO!");
        }else{
            System.out.println("Valor não confere!");
        }
    }
}
