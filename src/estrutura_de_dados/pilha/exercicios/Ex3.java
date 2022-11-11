package estrutura_de_dados.pilha.exercicios;

import estrutura_de_dados.pilha.Pilha;

public class Ex3 {
    public static void main(String[] args) {
        Livro livro;
        Pilha<Livro>pilha = new Pilha<>(20);

        for (int i=1; i<=6; i++){
            livro = new Livro("Nome"+i, "isbn"+i, 200+i, "Autor"+i);
            pilha.empilhar(livro);
        }

        System.out.println("Visualizando a pilha de livros: " + pilha);
        System.out.println(pilha);

        System.out.println("Espiando o último livro da pilha: " + pilha);
        System.out.println(pilha.topo());

        while (!pilha.estaVazia()){
            System.out.println(pilha.desempilha());
        }
        System.out.println("Pilha vazia: " + pilha);

    }
}
