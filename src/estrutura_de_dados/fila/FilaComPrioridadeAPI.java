package estrutura_de_dados.fila;

import java.util.PriorityQueue;
import java.util.Queue;

public class FilaComPrioridadeAPI {
    public static void main(String[] args) {
        Queue<Integer> filaComPrioridade = new PriorityQueue<>();

        filaComPrioridade.add(10);
        filaComPrioridade.add(8);
        filaComPrioridade.add(2);
        filaComPrioridade.add(1);

        System.out.println(filaComPrioridade);
    }
}
