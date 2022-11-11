package estrutura_de_dados.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        Stack pilha = new Stack();

        for (int i=1; i<=10; i++){
            System.out.print("Digite o " + i + " número: ");
            numero = entrada.nextInt();
            if (numero%2!=0 && pilha.isEmpty()){
                System.out.println("Não existem elementos para remover!");
            }else if(numero%2!=0){
                pilha.pop();
            }else{
                pilha.push(numero);
            }

        }

        if (!pilha.isEmpty()){
            for (int i=pilha.size(); i>0; i--){
                System.out.println("Desempilhando o elemento " + i +": " + pilha.pop());
            }
        }else {
            System.out.println("Pilha vazia!");
        }
        entrada.close();
    }
}
