package estrutura_de_dados.fila.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        Queue<Documento> fila = new LinkedList<>();

        fila.add(new Documento("Imagens", 2));
        fila.add(new Documento("Fotos", 8));
        fila.add(new Documento("Arquivos", 1));

        while (!fila.isEmpty()) {
            Documento doc = fila.remove();
            System.out.println("Imprimindo documento: " + doc.nome);
            try {
                for (int i = 1; i <= doc.qtdFolhas; i++) {
                    System.out.println("Imprimindo folha " + i);
                    Thread.sleep(200 * doc.qtdFolhas);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos documentos foram impressos!");
    }
}
