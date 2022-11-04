package estrutura_de_dados.estrutura_estatica;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }

    protected boolean adicionar(T elemento) {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    protected void adicionar(int posicao, T elemento) {
        aumentarCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!!");
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;

    }

    protected void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void tamanho() {
        System.out.println(this.tamanho);
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }
}
