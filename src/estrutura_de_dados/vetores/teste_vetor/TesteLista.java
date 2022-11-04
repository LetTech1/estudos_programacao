package estrutura_de_dados.vetores.teste_vetor;

import estrutura_de_dados.vetores.Contato;
import estrutura_de_dados.vetores.Lista;

public class TesteLista {
    public static void main(String[] args) {
        Lista<Contato> lista = new Lista<>(4);
        Contato c1 = new Contato("Ana", "São Paulo", "1678-9834");
        Contato c2 = new Contato("Joao", "Rio", "1678-0000");
        Contato c3 = new Contato("Tadeu", "Bahia", "1678-0000");

        lista.adicionar(c1);
        lista.adicionar(c2);
        lista.adicionar(c3);
        System.out.println(lista);
/*        lista.contem(c3);
        lista.ultimoIndice(c2);
        lista.remover(c2);
        System.out.println(lista);
        lista.obter(1);
        lista.limpar();
        System.out.println(lista);
        System.out.println(lista.buscar(c2));
        System.out.println(lista.contem(c2));*/
        //System.out.println(lista.ultimoIndice(c3));
        //lista.remove(c2);
        System.out.println(lista.obtem(2));

    }
}
