import org.xml.sax.InputSource;

public class InputSource_2 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setPublicId("http://example.com/publicId");
        System.out.println("Public ID set: " + inputSource.getPublicId());
    }
}
