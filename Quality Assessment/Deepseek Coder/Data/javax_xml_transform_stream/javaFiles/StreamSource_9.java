import javax.xml.transform.stream.StreamSource;

public class StreamSource_9 {
    public static void main(String[] args) {
        StreamSource streamSource = new StreamSource();
        streamSource.setSystemId("http://www.example.com/xml");
        System.out.println(streamSource.getSystemId());
    }
}
