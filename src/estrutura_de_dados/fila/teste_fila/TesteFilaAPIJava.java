package estrutura_de_dados.fila.teste_fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFilaAPIJava {
    public static void main(String[] args) {
        //Interface1 c = new Classe1();
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);

        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.remove());
        System.out.println(fila);

    }
}
