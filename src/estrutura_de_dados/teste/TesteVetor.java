package estrutura_de_dados.teste;

import estrutura_de_dados.vetores.Vetor;

public class TesteVetor {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(5);
        v1.adicionar("b");
        v1.adicionar("c");
        v1.adicionar("d");
        v1.adicionar("e");
/*            v1.tamanho();
            System.out.println(v1);
            v1.buscar(1);
            v1.buscar("d");
            v1.adicionar(0, "a");
            System.out.println(v1);
            v1.adicionar(2, "w");
            System.out.println(v1);*/
        System.out.println(v1);
        v1.remover(2);
        System.out.println(v1);
    }
}
