import javax.xml.transform.stream.StreamResult;

public class StreamResult_1 {
    public static void main(String[] args) {
        StreamResult streamResult = new StreamResult();
        streamResult.setSystemId("file:/path/to/your/file.xml");
        
        System.out.println("System Id: " + streamResult.getSystemId());
    }
}
