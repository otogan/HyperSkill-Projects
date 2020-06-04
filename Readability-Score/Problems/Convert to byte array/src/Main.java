import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Arrays;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        // implement the method
        CharArrayWriter writer = new CharArrayWriter();
        Arrays.stream(words).forEach(s -> {
            try {
                writer.write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        return writer.toCharArray();
    }
}