package aula18;

import java.io.RandomAccessFile;

public class AcessoRandomico {

    public static void main(String args[]) throws java.io.IOException {
        RandomAccessFile raf = new RandomAccessFile("c:\\Teste.arq", "rw");
        raf.writeBytes("Escrevendo a primeira linha.\n");
        raf.writeBytes("Escrevendo a segunda linha.\n");
        raf.seek(0);
        String s = raf.readLine();
        System.out.println("Primeira linha no texto: " + s);
        System.out.println("Posicao do Ponteiro: " + raf.getFilePointer());
        raf.seek(raf.length()); // vai para o final do arquivo
        raf.writeBytes("Escrevendo a última linha.\n");
        System.out.println("Tamanho do Arquivo: " + raf.length() + " bytes");
    }
}
