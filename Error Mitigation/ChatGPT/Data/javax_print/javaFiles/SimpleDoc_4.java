import javax.print.SimpleDoc;
import java.io.IOException;
import java.io.Reader;

public class SimpleDoc_4 {
    public static void main(String[] args) {
        SimpleDoc doc = new SimpleDoc("Sample text", DocFlavor.STRING.TEXT_PLAIN, null);
        
        try {
            Reader reader = doc.getReaderForText();
            if (reader != null) {
                int data;
                while ((data = reader.read()) != -1) {
                    System.out.print((char) data);
                }
                reader.close();
            } else {
                System.out.println("Reader cannot be provided for this doc.");
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred while creating the reader.");
            e.printStackTrace();
        }
    }
}
