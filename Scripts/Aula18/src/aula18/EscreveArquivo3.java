package aula18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreveArquivo3 {

    public static void main(String args[]) {
//        if (args.length == 0) {
//            System.out.println("uso:\njava LeituraBytes <nomeArquivo>");
//            System.exit(-1);
//        }

        String fileName = "c:\\Teste3.txt"; // args[0];
        try {
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f);
            PrintWriter out = new PrintWriter(fw);
            String conteudo = "Programacao Orientada a Objetos - POO";
            out.write(conteudo);

            System.out.println("Gerando conteudo...");
            for (byte i = 0; i < 20; i++) {
                out.write(i);
            }
            fw.close();
            out.close();
            System.out.println("Arquivo [" + fileName + "] fechado.");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + fileName);
        }
    }
}
