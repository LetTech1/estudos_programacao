package estruturas_de_controle.exercicios;

import java.util.Scanner;

/*1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;*/

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        if(num >= 0 && num <=10 && num%2==0){
            System.out.println("Número par");
        }else{
            System.out.println("Não se encaixa nos requisitos");
        }
    }
}
