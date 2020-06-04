import java.io.CharArrayWriter;
import java.io.IOException;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        // implement the method
        CharArrayWriter writer = new CharArrayWriter();
        for (String s : words) {
            try {
                writer.write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return writer.toCharArray();
    }
}