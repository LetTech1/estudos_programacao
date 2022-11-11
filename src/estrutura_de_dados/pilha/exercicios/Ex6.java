package estrutura_de_dados.pilha.exercicios;

import estrutura_de_dados.pilha.Pilha;

public class Ex6 {
    public static void main(String[] args) {

        imprimeResultado("A + B");
        imprimeResultado("A + B + C - D)");
        imprimeResultado("{[()]}[](){()}");
        imprimeResultado("{[(]}[](){()}");
    }

    public static void imprimeResultado(String expressao){
        System.out.println(expressao+ " está balanceada? " + verificaSimbolosBalanceados(expressao));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificaSimbolosBalanceados(String expressao){
        boolean balanceado = true;
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;

        for (int i = index; i<expressao.length(); i++){
            simbolo = expressao.charAt(i);

            if(ABRE.indexOf(simbolo)>-1){
                pilha.empilhar(simbolo);
            }else if(FECHA.indexOf(simbolo)>-1){
                if (pilha.estaVazia()){
                    return false;
                }else {
                    topo = pilha.desempilha();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
