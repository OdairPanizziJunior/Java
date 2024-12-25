package aula18;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LeArquivo2 {

    public static void main(String args[]) {
//        if (args.length == 0) {
//            System.out.println("uso:\njava LeituraBytes <nomeArquivo>");
//            System.exit(-1);
//        }

        String fileName = "c:\\windows\\system32\\autoexec.nt"; // args[0];
        try {
            File f = new File(fileName);
            InputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            String line;
            while ((line = dis.readLine()) != null) {
                System.out.println(line);
            }
            dis.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + fileName);
        }
    }
}
