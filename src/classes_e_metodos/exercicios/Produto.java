package classes_e_metodos.exercicios;

public class Produto {
    public String nome;
    public double preco;
    public static double desconto = 0.25;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
