package aula18;

import java.io.FileWriter;
import java.io.IOException;

public class Encode3 {

    public static void main(String args[]) throws IOException {
        FileWriter filewriter = new FileWriter("out");
        String encname = filewriter.getEncoding();
        filewriter.close();
        System.out.println("default charset is: " + encname);
/*
        Charset charset1 = Charset.forName(encname);
        Charset charset2 = Charset.forName("windows-1252");
        if (charset1.equals(charset2)) {
            System.out.println("Cp1252/windows-1252 equal");
        } else {
            System.out.println("Cp1252/windows-1252 unequal");
        }
 */
    }
}
