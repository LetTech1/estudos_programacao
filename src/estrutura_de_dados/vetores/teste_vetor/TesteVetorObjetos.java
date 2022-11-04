package estrutura_de_dados.vetores.teste_vetor;

import estrutura_de_dados.vetores.Contato;
import estrutura_de_dados.vetores.VetorObjetos;

public class TesteVetorObjetos {
    public static void main(String[] args) {

        Contato c1 = new Contato("Leticia", "Fernandopolis", "1789-9854");
        Contato c2 = new Contato("Ana", "Bahia", "1799-9854");
        Contato c3 = new Contato("Luiz", "Vptuporanga", "1789-0000");

        VetorObjetos v1 = new VetorObjetos(5);

        v1.adicionar(c1);
        v1.adicionar(c2);
        v1.adicionar(c3);

        System.out.println(v1);
        v1.buscar(c2);
        v1.remover(2);
        System.out.println(v1);

    }
}
