package estrutura_de_dados.vetores;

//Essa maneira não está correta, pois uma lista, vetor deve conter apenas um tipo de dado,
//e aqui podemos adicionar tipos variados

public class VetorObjetos {
    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionar(Object elemento){
        aumentarCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(int posicao, Object elemento){
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
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i<this.tamanho; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void buscar(int posicao){
        if(!(posicao >= 0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida!!");
        }
        System.out.println(elementos[posicao]);
    }

    public void buscar(Object elemento){
        for (int i = 0; i<tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                System.out.println(i);
                break;
            }
        }
    }

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
