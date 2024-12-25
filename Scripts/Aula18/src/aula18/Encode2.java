package aula18;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Encode2 {

    public static void main(String args[]) {
        Map availcs = Charset.availableCharsets();
        Set keys = availcs.keySet();
        for (Iterator iter = keys.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}
