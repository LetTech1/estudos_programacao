package estrutura_de_dados.pilha.teste_pilha;

import estrutura_de_dados.pilha.Pilha;

public class PilhaTeste {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        System.out.println(pilha);
        pilha.tamanho();

        for (int i=1; i<=10; i++){
            pilha.empilhar(i);
        }

        System.out.println(pilha);
        pilha.tamanho();

        System.out.println(pilha.estaVazia());

        System.out.println(pilha.topo());

        System.out.println("Desempilhando o elemento: " + pilha.desempilha());
        System.out.println(pilha);
    }

}
