import java.beans.Encoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;

public class Encoder_3 {
    public static void main(String[] args) {
        Encoder encoder = new XMLEncoder(new ByteArrayOutputStream());
        encoder.writeObject(new Object()); // Write the specified object to the output stream
        encoder.close();
    }
}
