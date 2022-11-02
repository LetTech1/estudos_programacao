package estruturas_de_controle.exercicios;

import java.util.Scanner;

/*5. Refatorar o exercício 04, utilizando a estrutura switch.*/

public class Ex5 {
    public static void main(String[] args) {
        int contarDivisores = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contarDivisores++;
            }
        }

        switch (contarDivisores){
            case 2:
                System.out.println(numero + " é primo!");
                break;
            default:
                System.out.println(numero + " não é primo!");
        }

    }
}
