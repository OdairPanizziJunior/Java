package aula18;

import java.io.UnsupportedEncodingException;

 public class Encode6 {
        public static void main(String args[]) throws UnsupportedEncodingException {
            String str = "testing";

            byte bytevec1[] = str.getBytes();
            byte bytevec2[] = str.getBytes("UTF-16");
    
            System.out.println("bytevec1 length = " + bytevec1.length + " " + bytevec1);
            System.out.println("bytevec2 length = " + bytevec2.length + " " + bytevec2);

            System.out.println(new String("ç".getBytes("UTF-8"), "ISO-8859-1"));
        }
    }
