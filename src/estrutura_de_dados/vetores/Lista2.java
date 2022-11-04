package estrutura_de_dados.vetores;

import estrutura_de_dados.estrutura_estatica.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(){
        super();
    }

    public Lista2(int capacidade){
        super(capacidade);
    }

    public boolean adicionar(T elemento){
        return super.adicionar(elemento);
    }

    public void adicionar(int posicao, T elemento){
        super.adicionar(posicao, elemento);
    }
}
