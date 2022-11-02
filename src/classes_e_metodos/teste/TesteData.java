package classes_e_metodos.teste;

import classes_e_metodos.exercicios.Data;

public class TesteData {
    public static void main(String[] args) {
        Data d = new Data();
        d.dia = 27;
        d.mes = 03;
        d.ano = 1999;

        System.out.printf("%d/%d/%d\n", d.dia, d.mes, d.ano);
        System.out.println(d.obterDataFormatada());

        Data d2 = new Data();
        System.out.println(d2.obterDataFormatada());

    }
}
