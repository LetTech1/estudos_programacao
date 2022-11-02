package classes_e_metodos.exercicios;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data() {
        this.dia = 01;
        this.mes = 01;
        this.ano = 1970;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

}
