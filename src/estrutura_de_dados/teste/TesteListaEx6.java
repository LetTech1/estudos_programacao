package estrutura_de_dados.teste;

import estrutura_de_dados.vetores.Contato;
import estrutura_de_dados.vetores.Lista;

public class TesteListaEx6 {
    public static void main(String[] args) {
        Lista<Contato> contatos = new Lista<>(20);

        System.out.println(contatos);

        contatos.tamanho();
        contatos.obter(5);
        contatos.remover(8);
        contatos.tamanho();
        contatos.buscar(2);

    }

    public static void criarContatos(int quantidade, Lista<Contato> lista){
        Contato c;

        for (int i=0; i<30; i++){
            c = new Contato();
            c.setNome("Contato"+i);
            c.setTelefone("11111111"+i);
            c.setCidade("Fernandopolis"+i);
            lista.adicionar(c);
        }
    }
}
