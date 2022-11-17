package estrutura_de_dados.fila.teste_fila;

import estrutura_de_dados.fila.FilaComPrioridade;

public class TesteFilaComPrioridade {
    public static void main(String[] args) {
        FilaComPrioridade<Integer> fp = new FilaComPrioridade<>();

        fp.adiciona(1);
        fp.adiciona(10);
        fp.adiciona(8);
        fp.adiciona(11);

        System.out.println(fp);
    }
}
