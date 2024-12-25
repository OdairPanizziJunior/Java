package aula18;

/**
 *
 * @author User
 */
public class TestaConverteUnicode {

    public static void main(String[] args) {
        String original = "ATENÇÃO! Pedimos que troque o pão francês para pão sírio.";
        StringBuilder output = new StringBuilder();
        for (int idx = 0; idx < original.length(); idx++) {
            char c = original.charAt(idx);
            if (!Character.isWhitespace(c) && !Character.isDigit(c) && !(c >= 33 && c <= 125)) {
                output.append("\\u" + charToHex(c));
            } else {
                output.append(c);
            }
        }
        System.out.println(output.toString());
    }

    static public String charToHex(char c) {
// Returns hex String representation of char c
        byte hi = (byte) (c >>> 8);
        byte lo = (byte) (c & 0xff);
        return byteToHex(hi) + byteToHex(lo);
    }

    static public String byteToHex(byte b) {
// Returns hex String representation of byte b
        char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] array = {hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f]};
        return new String(array);
    }
}
