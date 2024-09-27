import javax.xml.transform.stream.StreamSource;

public class StreamSource_4 {
    public static void main(String[] args) {
        StreamSource source = new StreamSource();
        source.setPublicId("examplePublicId");
        System.out.println("Public ID set to: " + source.getPublicId());
    }
}
