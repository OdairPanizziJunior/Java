package aulas.aula18.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCria {

    public static void main(String args[]) throws IOException {
        File diretorio = new File("c:\\novo");
        diretorio.mkdir(); // cria, se possível
        File subdir1 = new File(diretorio, "subdir1");
        subdir1.mkdir();
        File subdir2 = new File(diretorio, "subdir2");
        subdir2.mkdir();
        File arquivo = new File(diretorio, "arquivoVazio.txt");
        FileWriter f = new FileWriter(arquivo);
        f.close();
        String[] arquivos = diretorio.list();
        for (int i = 0; i < arquivos.length; i++) {
            File filho = new File(diretorio, arquivos[i]);
            System.out.println(filho.getAbsolutePath());
        }
    }
}
