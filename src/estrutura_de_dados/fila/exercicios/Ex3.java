package estrutura_de_dados.fila.exercicios;

import estrutura_de_dados.fila.FilaComPrioridade;

public class Ex3 {

    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) throws InterruptedException {
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
        fila.adiciona(new Pessoa("1", VERDE));
        fila.adiciona(new Pessoa("2", AMARELO));
        fila.adiciona(new Pessoa("3", VERMELHO));
        fila.adiciona(new Pessoa("4", VERDE));
        fila.adiciona(new Pessoa("5", VERDE));
        fila.adiciona(new Pessoa("6", VERMELHO));

        AtendimentoConcluido atendimento = new AtendimentoConcluido(fila);
        NovoPaciente novoPaciente = new NovoPaciente(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(novoPaciente);

        t1.start();
        t2.start();
    }
}

