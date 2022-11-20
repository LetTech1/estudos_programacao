package estrutura_de_dados.fila.exercicios;

import estrutura_de_dados.fila.FilaComPrioridade;

public class AtendimentoConcluido implements Runnable {

    private FilaComPrioridade<Pessoa> fila;

    public AtendimentoConcluido(FilaComPrioridade<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {
        while(!fila.estaVazia()){
            try {
                System.out.println(fila.desenfileira() + " atendido");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Atendimento concluído!");
    }
}
