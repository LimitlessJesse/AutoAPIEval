import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLEncoder_2 {
    public static void main(String[] args) {
        try {
            XMLEncoder encoder = new XMLEncoder(new FileOutputStream("file.xml"));
            encoder.flush();
            encoder.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
