package aula18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo6 {

    public static void main(String args[]) {
//        if (args.length == 0) {
//            System.out.println("uso:\njava LeituraBytes <nomeArquivo>");
//            System.exit(-1);
//        }

        String fileName = "c:\\windows\\system32\\autoexec.nt"; // args[0];
        try {
            File f = new File(fileName);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String s;
            while ((s = br.readLine()) != null) {
                line = line + s + "\n";
            }
            fr.close();
            br.close();

            System.out.println("\n" + line + "\n");

        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo " + fileName);
        }
    }
}
