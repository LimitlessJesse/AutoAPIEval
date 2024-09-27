import org.xml.sax.InputSource;

public class InputSource_11 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setSystemId("http://example.com/file.xml");
        System.out.println("System Id: " + inputSource.getSystemId());
    }
}
