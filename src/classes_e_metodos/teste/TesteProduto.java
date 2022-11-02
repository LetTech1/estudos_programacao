package classes_e_metodos.teste;

import classes_e_metodos.exercicios.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Celular", 1500.00);
        System.out.println(p.preco - (p.preco*Produto.desconto));
    }
}
