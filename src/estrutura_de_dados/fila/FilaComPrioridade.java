package estrutura_de_dados.fila;

public class FilaComPrioridade<T> extends Fila2<T> {

    public FilaComPrioridade(int capacidade) {
        super(capacidade);
    }

    public FilaComPrioridade() {}

    public void adiciona(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for (i=0; i<this.tamanho; i++){
            if (chave.compareTo(this.elementos[i])<0){
                break;
            }
        }
        this.adicionar(i, elemento);
    }
}
