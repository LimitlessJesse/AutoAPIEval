import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;

public class XMLEncoder_4 {
    public static void main(String[] args) {
        XMLEncoder encoder = new XMLEncoder(new ByteArrayOutputStream());
        encoder.writeObject("Hello World");
        encoder.close();
    }
}
