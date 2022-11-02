package estruturas_de_controle.exercicios;

import java.util.Scanner;

/*7. Criar um programa que enquanto estiver recebendo números positivos,
        imprime no console a soma dos números inseridos, caso receba um número negativo,
        encerre o programa. Tente utilizar a estrutura do while.*/

public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        while (num>=0){
            soma+=num;
            System.out.println("Soma = " + soma);
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
        }

        System.out.println("Número negativo não é aceito!");
    }
}
