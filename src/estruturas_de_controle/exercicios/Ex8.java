package estruturas_de_controle.exercicios;

import java.util.Scanner;

/*8. Criar um programa que receba uma palavra e imprime no console letra por letra.*/

public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = entrada.next();

        for (int i = 0; i<palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
    }
}
