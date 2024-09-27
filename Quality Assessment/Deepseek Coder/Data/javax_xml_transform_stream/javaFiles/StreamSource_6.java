import javax.xml.transform.stream.StreamSource;

public class StreamSource_6 {
    public static void main(String[] args) {
        // Create a StreamSource object
        StreamSource source = new StreamSource("file.xml");
        
        // Get the system id of the StreamSource
        String systemId = source.getSystemId();
        
        // Print the system id
        System.out.println("System Id: " + systemId);
    }
}
