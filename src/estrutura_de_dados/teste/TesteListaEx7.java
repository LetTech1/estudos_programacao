package estrutura_de_dados.teste;

import estrutura_de_dados.vetores.Contato;

import java.util.ArrayList;

public class TesteListaEx7 {
    public static void main(String[] args) {
        ArrayList<Contato> elementos = new ArrayList<>(20);

        for (int i=0; i<30; i++){
            Contato c = new Contato("Ana", "Fernandopolis", "9625-4845");
            elementos.add(i, c);
        }

        System.out.println(elementos);
        System.out.println(elementos.size());
        System.out.println(elementos.get(10));
        elementos.clear();
        System.out.println(elementos);
    }
}
