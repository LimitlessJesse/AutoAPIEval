import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class XMLDecoder_2 {
    public static void main(String[] args) {
        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new FileInputStream("file.xml"));
            // Decode objects from the file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (decoder!= null) {
                decoder.close();
            }
        }
    }
}
