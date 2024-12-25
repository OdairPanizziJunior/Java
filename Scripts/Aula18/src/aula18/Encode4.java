package aula18;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class Encode4 {

    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("missing charset name");
            System.exit(1);
        }

        String charsetname = args[0];
        Charset charset;

        try {
            charset = Charset.forName(charsetname);
            System.out.println("charset lookup successful");
        } catch (UnsupportedCharsetException exc) {
            System.out.println("unknown charset: " + charsetname);
        }
    }
}
