import javax.xml.transform.stream.StreamSource;

public class StreamSource_1 {
    public static void main(String[] args) {
        StreamSource source = new StreamSource();
        source.setSystemId("http://example.com/data.xml");
        System.out.println("System ID set to: " + source.getSystemId());
    }
}
