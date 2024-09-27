import org.xml.sax.InputSource;

public class InputSource_17 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setSystemId("file:/C:/example.xml");
        System.out.println(inputSource.getSystemId());
    }
}
