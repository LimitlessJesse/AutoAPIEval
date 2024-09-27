import org.xml.sax.InputSource;

public class InputSource_16 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setSystemId("http://example.com");
        System.out.println(inputSource.getSystemId());
    }
}
