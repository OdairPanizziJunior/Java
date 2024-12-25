package aula18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Encode5 {

    public static void main(String args[]) throws IOException {
        FileOutputStream fileoutstream = new FileOutputStream("out");
        Writer writer = new OutputStreamWriter(fileoutstream, "UTF-8");
        writer.write("testing");
        writer.close();
    }
}
