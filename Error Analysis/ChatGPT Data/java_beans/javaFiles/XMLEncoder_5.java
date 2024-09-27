import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLEncoder_5 {
    public static void main(String[] args) {
        try {
            // Create an XMLEncoder object
            XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("output.xml")));

            // Object to be written
            Object objectToWrite = new Object();

            // Write the object using writeObject method
            encoder.writeObject(objectToWrite);

            // Close the encoder
            encoder.close();

            System.out.println("Object successfully written to output.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
