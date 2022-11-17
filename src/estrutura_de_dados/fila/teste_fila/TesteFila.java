package estrutura_de_dados.fila.teste_fila;

import estrutura_de_dados.fila.Fila;
import estrutura_de_dados.fila.Fila2;

public class TesteFila {
    public static void main(String[] args) {

        Fila2<Integer> fila2 = new Fila2<>();
        fila2.adiciona(1);
        fila2.adiciona(2);
        fila2.adiciona(3);
        System.out.println(fila2.estaVazia());
        fila2.espiar();
        fila2.desenfileira();
        fila2.tamanho();
        System.out.println(fila2);

    }
}
