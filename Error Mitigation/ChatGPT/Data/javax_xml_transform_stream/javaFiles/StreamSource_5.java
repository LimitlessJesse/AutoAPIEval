import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

public class StreamSource_5 {
    public static void main(String[] args) {
        String xmlString = "<root><element>Value</element></root>";
        StreamSource source = new StreamSource(new StringReader(xmlString));
        
        Reader reader = source.getReader();
        if(reader != null) {
            int data;
            try {
                while ((data = reader.read()) != -1) {
                    System.out.print((char) data);
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No character stream set.");
        }
    }
}
