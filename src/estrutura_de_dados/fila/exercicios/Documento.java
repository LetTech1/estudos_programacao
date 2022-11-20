package estrutura_de_dados.fila.exercicios;

public class Documento{
    public String nome;
    public int qtdFolhas;


    public Documento(String nome, int qtdFolhas) {
        this.nome = nome;
        this.qtdFolhas = qtdFolhas;
    }


    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", qtdFolhas=" + qtdFolhas +
                '}';
    }
}
