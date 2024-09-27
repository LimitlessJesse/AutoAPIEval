import javax.xml.transform.stax.StAXSource;

public class StAXSource_3 {
    public static void main(String[] args) {
        StAXSource source = new StAXSource();
        try {
            source.setSystemId("http://example.com");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }
    }
}
