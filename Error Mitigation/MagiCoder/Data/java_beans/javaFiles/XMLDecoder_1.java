import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class XMLDecoder_1 {
    public static void main(String[] args) {
        try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("file.xml")))) {
            Object obj = decoder.readObject();
            System.out.println(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
