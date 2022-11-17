package estrutura_de_dados.fila;

import estrutura_de_dados.estrutura_estatica.EstruturaEstatica;

public class Fila2<T> extends EstruturaEstatica<T> {

    public Fila2(){super();}

    public Fila2(int capacidade){
        super(capacidade);
    }

    public void adiciona(T elemento) {
        this.aumentarCapacidade();
        this.elementos[tamanho] = elemento;
        tamanho++;
    }

    public void espiar() {
        if(this.estaVazia()){
            System.out.println("Fila vazia!");
        }
        System.out.println(this.elementos[0]);
    }

    public void desenfileira() {
        if (this.estaVazia()){
            System.out.println("Não existe elementos na fila!");
        }
        System.out.println("Senha: " + this.elementos[0]);
        for (int i = 0; i < tamanho; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        tamanho--;
    }
}
