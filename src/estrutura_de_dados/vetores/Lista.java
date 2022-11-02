package estrutura_de_dados.vetores;

import java.lang.reflect.Array;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    //Essa é a maneira recomendada para fazer isso, ela foi apresentada no livro "Java efetivo"
    //É mais fácil de compreender, do que a segunda opção
    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adicionar(T elemento){
        aumentarCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(int posicao, T elemento){
        aumentarCapacidade();
        if(!(posicao >= 0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida!!");
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;

    }

    private void aumentarCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i<this.tamanho; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public T buscar(int posicao){
        if(!(posicao >= 0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida!!");
        }
        return elementos[posicao];
    }

    public int buscar(T elemento){
        for (int i = 0; i<tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento){
        return buscar(elemento) > -1;
    }

   /* public void contem(T elemento){
        for (int i=0; i<this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                System.out.println("O elemento está na posição " + i);
                break;
            }
        }
    }*/

    public void tamanho(){
        System.out.println(this.tamanho);
    }

    public void remover(int posicao){
        if(!(posicao >= 0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida!!");
        }
        for (int i = posicao; i <= this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        tamanho--;
    }

    public int ultimoIndice(T elemento){
        for (int i=this.tamanho-1; i>=0; i--){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void remover(T elemento){
        for (int i = this.tamanho-1; i<this.elementos.length; i--) {
            if (this.elementos[i].equals(elemento)){
                for (int j = i; j <this.tamanho; j++) {
                    this.elementos[j] = this.elementos[j + 1];
                }
                break;
            }
        }
        tamanho--;
    }

    public void remove(T elemento){
        int pos = this.buscar(elemento);
        if (pos>-1){
            this.remover(pos);
        }
    }

    public void obter(int posicao){
        if(!(posicao >= 0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida!!");
        }
        for (int i=0; i<this.tamanho; i++){
            if (i==posicao){
                System.out.println(this.elementos[i]);
                break;
            }
        }
    }

    public T obtem(int posicao){
        return this.buscar(posicao);
    }

    public void limpar(){
        for (int i = 0; i < this.elementos.length; i++){
            if(!(this.elementos[i] == null)){
                this.elementos[i] = null;
            }
        }
        this.tamanho = 0;
    }

    /*public void limpar2(){
        this.elementos = (T[]) new Object[this.elementos.length];
    }*/

    /*public void limpar3(){
        this.tamanho = 0;
    }*/


    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i<this.tamanho-1; i++){
            s.append(elementos[i]);
            s.append(", ");
        }
        if (this.tamanho>0){
            s.append(elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
}
