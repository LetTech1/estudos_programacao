package estrutura_de_dados.fila;


public class Fila<T> {

    private T[] elementos;
    private int tamanho = 0;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Fila() {}

    public T[] getElementos() {
        return elementos;
    }

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void adicionar(T elemento) {
        aumentaCapacidade();
        if (this.tamanho <= this.elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho++;
        }
    }

    public boolean estaVazia() {
        if (tamanho != 0) {
            return false;
        }
        return true;
    }

    public void espiar() {
        System.out.println(this.elementos[0]);
    }

    public void desenfileira() {
        System.out.println("Senha: " + this.elementos[0]);
        for (int i = 0; i < tamanho; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        tamanho--;
    }

    public void tamanho() {
        System.out.println("Tamanho: " + this.tamanho);
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

