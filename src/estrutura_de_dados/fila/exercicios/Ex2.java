package estrutura_de_dados.fila.exercicios;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex2 {
    public static void main(String[] args) {
        Queue<String> filaPrioridade = new PriorityQueue<>();
        Queue<String> filaNormal = new PriorityQueue<>();

        final int CHAMADA = 3;

        filaNormal.add("1");
        filaNormal.add("2");
        filaNormal.add("3");
        filaNormal.add("4");
        filaNormal.add("5");
        filaPrioridade.add("1P");
        filaPrioridade.add("2P");
        filaPrioridade.add("3P");
        filaPrioridade.add("4P");
        filaPrioridade.add("5P");
        filaNormal.add("6");
        filaNormal.add("7");
        filaNormal.add("8");
        filaNormal.add("9");
        filaNormal.add("10");

        while(!filaPrioridade.isEmpty() || !filaNormal.isEmpty()){
            int cont = 0;

            while(!filaPrioridade.isEmpty() && cont<CHAMADA){
                atender(filaPrioridade);
                cont++;
            }

            if (!filaNormal.isEmpty()){
                atender(filaNormal);
            }

            if (filaPrioridade.isEmpty()){
                while (!filaNormal.isEmpty()){
                    atender(filaNormal);
                }
            }
        }

    }

    public static void atender(Queue<String> f){
        String senha = f.remove();
        System.out.println("Senha: " + senha);
    }
}
