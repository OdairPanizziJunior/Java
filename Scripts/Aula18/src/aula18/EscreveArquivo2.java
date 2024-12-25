package aula18;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscreveArquivo2 {

    public static void main(String args[]) {
//        if (args.length == 0) {
//            System.out.println("uso:\njava LeituraBytes <nomeArquivo>");
//            System.exit(-1);
//        }

        String fileName = "c:\\Teste2.dat"; // args[0];
        try {
            File f = new File(fileName);
            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream( bos );
            String conteudo = "Programacao Orientada a Objetos - POO";
            dos.writeUTF(conteudo);

            System.out.println("Gerando conteudo...");
            for (byte i = 0; i < 20; i++) {
                dos.writeByte(i);
            }
            dos.writeDouble(123.45);
            bos.close();
            dos.close();
            fos.close();
            System.out.println("Arquivo [" + fileName + "] fechado.");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + fileName);
        }
    }
}
