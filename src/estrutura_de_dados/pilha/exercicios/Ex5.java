package estrutura_de_dados.pilha.exercicios;

import estrutura_de_dados.pilha.Pilha;

public class Ex5 {
    public static void main(String[] args) {
        testaPalindromo("ABFFBB");
    }

    public static void testaPalindromo(String palavra){
        Pilha<Character>elementos = new Pilha<>();
        String palavraInversa = "";
        for (int i=0; i<palavra.length(); i++){
            elementos.empilhar(palavra.charAt(i));
        }
        while (!elementos.estaVazia()){
            palavraInversa+=elementos.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)){
            System.out.print("É palíndromo!");
        }else{
            System.out.print("Não é palíndromo!");
        }
    }
}
