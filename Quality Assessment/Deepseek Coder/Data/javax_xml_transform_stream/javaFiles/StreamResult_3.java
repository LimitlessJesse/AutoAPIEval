import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;

public class StreamResult_3 {
    public static void main(String[] args) {
        try {
            // Create a new StreamResult object
            StreamResult result = new StreamResult();

            // Create a new FileWriter object
            FileWriter writer = new FileWriter("output.xml");

            // Set the writer for the StreamResult object
            result.setWriter(writer);

            // Write to the output file
            writer.write("<root>Hello, World!!!</root>");
            writer.close();

            System.out.println("XML file has been written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
