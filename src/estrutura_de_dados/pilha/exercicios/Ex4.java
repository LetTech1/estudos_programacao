package estrutura_de_dados.pilha.exercicios;

import estrutura_de_dados.pilha.Pilha;

import java.util.Stack;

public class Ex4 {
    public static void main(String[] args) {
        Livro livro;
        Stack<Livro> pilha = new Stack<>();

        for (int i=1; i<=6; i++){
            livro = new Livro("Nome"+i, "isbn"+i, 200+i, "Autor"+i);
            pilha.push(livro);
        }

        System.out.println("Visualizando a pilha de livros: " + pilha);
        System.out.println(pilha);

        System.out.println("Espiando o último livro da pilha: " + pilha);
        System.out.println(pilha.peek());

        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
        System.out.println("Pilha vazia: " + pilha);
        System.out.println(pilha);

    }
}
