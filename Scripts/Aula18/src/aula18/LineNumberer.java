package aula18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LineNumberer {

    public static void main(String args[]) {
        String inputFileName = JOptionPane.showInputDialog(null, "Informe o arquivo origem");
        String outputFileName = JOptionPane.showInputDialog(null, "Informe o arquivo destino");

        try {
            FileReader reader = new FileReader(inputFileName);
            Scanner in = new Scanner(reader);
            PrintWriter out = new PrintWriter(outputFileName);

            int lineNumber = 0;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                out.println("/* " + ++lineNumber + " */ " + line);
            }
            out.close();
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
