package estrutura_de_dados.fila.exercicios;

import estrutura_de_dados.fila.FilaComPrioridade;

import java.util.Random;

public class NovoPaciente implements Runnable{

    private FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public NovoPaciente(FilaComPrioridade<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {
        for (int i=0; i<8; i++){
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa(""+cont, prioridade.nextInt(3));
                fila.adiciona(p);
                cont++;
                System.out.println(p + " enfileirada");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
