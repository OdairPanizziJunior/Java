package aula18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscreveArquivo {

    public static void main(String args[]) {
//        if (args.length == 0) {
//            System.out.println("uso:\njava LeituraBytes <nomeArquivo>");
//            System.exit(-1);
//        }

        String fileName = "c:\\Teste.dat"; // args[0];
        try {
            File f = new File(fileName);
            FileOutputStream fos = new FileOutputStream(f);

            String conteudo = "Programacao Orientada a Objetos - POO";
            fos.write(conteudo.getBytes());

            System.out.println("Gerando conteudo...");
            for (byte i = 0; i < 20; i++) {
                fos.write(i);
            }
            
            fos.close();
            System.out.println("Arquivo [" + fileName + "] fechado.");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + fileName);
        }
    }
}
