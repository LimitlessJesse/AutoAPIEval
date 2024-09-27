import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLEncoder_3 {
    public static void main(String[] args) {
        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new FileOutputStream("file.xml"));
            // encode an object
            encoder.writeObject(new Object());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (encoder!= null) {
                encoder.close(); // close the encoder
            }
        }
    }
}
