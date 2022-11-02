package estruturas_de_controle.exercicios;

import java.util.Scanner;

/*4. Criar um programa que receba um número e diga se ele é um número primo.*/

public class Ex4 {
    public static void main(String[] args) {
        int contarDivisores = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                contarDivisores++;
            }
        }
        if(contarDivisores == 2){
            System.out.println(numero + " é primo!");
        }else{
            System.out.println(numero + " não é primo!");
        }
    }
}
