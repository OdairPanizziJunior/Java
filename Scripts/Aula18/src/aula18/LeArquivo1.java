package aula18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LeArquivo1 {

    public static void main(String args[]) {
//        if (args.length == 0) {
//            System.out.println("uso:\njava LeituraBytes <nomeArquivo>");
//            System.exit(-1);
//        }

        String fileName = "c:\\windows\\system32\\autoexec.nt"; // args[0];
        try {
            File f = new File(fileName);
            InputStream fis = new FileInputStream(f);
            String line = "";
            while (true) {
                byte[] buffer = new byte[1024];
                int length = fis.read(buffer);
                if (length == -1) {
                    break;
                }                
                line = line + new String(buffer);
            }
            fis.close();
            System.out.println("\n" + line + "\n");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + fileName);
        }
    }
}
