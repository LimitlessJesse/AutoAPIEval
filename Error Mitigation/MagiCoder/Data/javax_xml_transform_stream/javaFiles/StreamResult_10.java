import javax.xml.transform.stream.StreamResult;

public class StreamResult_10 {
    public static void main(String[] args) {
        StreamResult streamResult = new StreamResult();
        streamResult.setSystemId("http://example.com");
        System.out.println(streamResult.getSystemId());
    }
}
