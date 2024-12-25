package aula18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeituraConsole {

    public static void main(String args[]) {
        InputStream in = System.in;
        InputStreamReader is = new InputStreamReader(in);
        BufferedReader console = new BufferedReader(is);
        System.out.print("Qual e o seu nome: ");
        String name = null;
        try {
            name = console.readLine();
        } catch (IOException e) {
            name = "<" + e + ">";
        }
        System.out.println("Hello " + name);
    }
}
