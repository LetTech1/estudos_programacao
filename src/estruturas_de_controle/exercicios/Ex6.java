package estruturas_de_controle.exercicios;

import java.util.Random;
import java.util.Scanner;

/*6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
        O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
        de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.*/

public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numDigitado = 0;
        int cont = 10;
        Random random = new Random();
        int numero = random.nextInt(100);

        System.out.println("num sorteado " + numero);

        for(int i = 10; i>=0; i--){
            cont--;
            System.out.print("Tente adivinhar o número sorteado: ");
            numDigitado = entrada.nextInt();
            if(numDigitado == numero){
                System.out.println("Você acertouuuu!!");
                break;
            }else if(numDigitado < numero){
                System.out.println("O número sorteado é maior do que o número que você digitou!");
                System.out.println("Você tem " + cont + " chances");
            }else{
                System.out.println("O número sorteado é menor do que o número que você digitou!");
                System.out.println("Você tem " + cont + " chances");
            }
            if(cont == 0){
                break;
            }
        }
    }
}
