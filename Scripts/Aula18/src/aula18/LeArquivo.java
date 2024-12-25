package aula18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeArquivo {

    public static void main(String args[]) {
//        if (args.length == 0) {
//            System.out.println("uso:\njava LeituraBytes <nomeArquivo>");
//            System.exit(-1);
//        }

        String fileName = "c:\\windows\\system32\\autoexec.nt"; // args[0];
        try {
            File f = new File(fileName);
            FileInputStream fis = new FileInputStream(f);
            String line = "";
            while (fis.available() > 0) {
                char ch = (char) fis.read();
                if (ch == '@') {
                    fis.skip(10);
                    continue;
                }
                line = line + ch;
            }

            System.out.println("\n" + line + "\n");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + fileName);
        }
    }
}
