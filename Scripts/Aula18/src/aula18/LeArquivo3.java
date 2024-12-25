package aula18;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeArquivo3 {

    public static void main(String args[]) {
//        if (args.length == 0) {
//            System.out.println("uso:\njava LeituraBytes <nomeArquivo>");
//            System.exit(-1);
//        }

        String fileName = "c:\\windows\\system32\\autoexec.nt"; // args[0];
        try {
            File f = new File(fileName);
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            int tamArq = (int) f.length();
            byte []buffer = new byte [tamArq];
            dis.readFully (buffer);

            dis.close();
            fis.close();

            System.out.println("\n" + new String(buffer) + "\n");

        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + fileName);
        }
    }
}
