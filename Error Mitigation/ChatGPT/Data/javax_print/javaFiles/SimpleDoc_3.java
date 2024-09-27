import javax.print.SimpleDoc;
import java.io.InputStream;
import java.io.IOException;

public class SimpleDoc_3 {
    public static void main(String[] args) {
        SimpleDoc doc = new SimpleDoc(new byte[]{0x48, 0x65, 0x6C, 0x6C, 0x6F}, null, null);
        
        try {
            InputStream inputStream = doc.getStreamForBytes();
            if (inputStream != null) {
                int data;
                while ((data = inputStream.read()) != -1) {
                    System.out.print((char) data);
                }
                inputStream.close();
            } else {
                System.out.println("Input stream cannot be provided for this doc.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
