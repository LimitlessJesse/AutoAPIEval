import java.io.*;

public class Reader_1 {
    public static void main(String[] args) {
        try {
            Reader reader = new StringReader("Hello, World!");
            int charRead = reader.read();
            while (charRead != -1) {
                System.out.print((char) charRead);
                charRead = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
