package aula18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class DataWrite {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("c:\\speech.txt");
        OutputStreamWriter outWriter = new OutputStreamWriter(fileOut, "CP037");
        PrintWriter out = new PrintWriter(outWriter);
        out.print("The universe ");
        out.println("is a very big place.");
        out.close();
    }
}
