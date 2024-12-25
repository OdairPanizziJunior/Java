package aula18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * http://java.sun.com/developer/JDCTechTips/2003/tt0110.html#1
 */
public class Encode1 {

    public static void main(String args[])  throws IOException {
        Writer writer = new FileWriter("out");
        writer.write("testing");
        writer.close();
    }
}
