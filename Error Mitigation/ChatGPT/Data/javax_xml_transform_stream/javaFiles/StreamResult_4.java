import javax.xml.transform.stream.StreamResult;

public class StreamResult_4 {
    public static void main(String[] args) {
        StreamResult result = new StreamResult();
        result.setSystemId("file:///path/to/file.xml");
    }
}
