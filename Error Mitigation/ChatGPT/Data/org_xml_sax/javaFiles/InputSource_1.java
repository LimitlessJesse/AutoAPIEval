import org.xml.sax.InputSource;

public class InputSource_1 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setSystemId("http://example.com/xmlfile.xml");
        System.out.println("System ID set to: " + inputSource.getSystemId());
    }
}
