package aula18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataRead {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("c:\\recipe.txt");
        InputStreamReader inReader = new InputStreamReader(file, "CP037");
        BufferedReader inBuffer = new BufferedReader(inReader);
        String message = inBuffer.readLine();
        System.out.println(message);
        inBuffer.close();
    }
}
