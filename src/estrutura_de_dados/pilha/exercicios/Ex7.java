package estrutura_de_dados.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ex7 {
    public static void main(String[] args) {
        imprimiResultado(2);
        imprimiResultado(4);
        imprimiResultado(10);
        imprimiResultado(25);
        imprimiResultado(10035);
    }

    public static void imprimiResultado(int numero){
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static String decimalBinario(int numero){
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while (numero>0){
            resto = numero % 2;
            pilha.push(resto);
            numero = numero/2;
        }

        while (!pilha.isEmpty()){
            numBinario += pilha.pop();
        }
        return numBinario;
    }
}
