import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class XMLDecoder_1 {
    public static void main(String[] args) {
        try (XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("data.xml")))) {
            Object object = xmlDecoder.readObject();
            System.out.println("Object read from XML: " + object.toString());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
