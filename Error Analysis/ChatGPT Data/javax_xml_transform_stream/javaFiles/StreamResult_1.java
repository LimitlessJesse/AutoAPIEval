import javax.xml.transform.stream.StreamResult;

public class StreamResult_1 {
    public static void main(String[] args) {
        StreamResult result = new StreamResult();
        result.setSystemId("sampleSystemId");
        System.out.println("System ID set to: " + result.getSystemId());
    }
}
