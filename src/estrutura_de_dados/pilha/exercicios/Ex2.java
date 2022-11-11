package estrutura_de_dados.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        Stack pilhaPar = new Stack();
        Stack pilhaImpar = new Stack();

        for (int i=1; i<=10; i++){
            System.out.print("Digite o " + i + " número: ");
            numero = entrada.nextInt();
            if (numero%2==0 && numero!=0){
                pilhaPar.push(numero);
            }else if(numero==0){
                if (!pilhaPar.isEmpty() && !pilhaImpar.isEmpty()){
                    pilhaPar.pop();
                    pilhaImpar.pop();
                }else{
                    System.out.println("ERRO, pilha vazia!");
                }
            }else{
                pilhaImpar.push(numero);
            }

        }

        if (!pilhaPar.isEmpty()){
            for (int i=pilhaPar.size(); i>0; i--){
                System.out.println("Desempilhando o elemento " + i +" da pilha PAR: " + pilhaPar.pop());
            }
            for (int i=pilhaImpar.size(); i>0; i--){
                System.out.println("Desempilhando o elemento " + i +" da pilha ÍMPAR: " + pilhaImpar.pop());
            }
        }else {
            System.out.println("Pilha vazia!");
        }
        entrada.close();
    }
}
