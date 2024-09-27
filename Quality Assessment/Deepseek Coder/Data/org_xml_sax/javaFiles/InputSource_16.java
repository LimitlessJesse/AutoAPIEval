import org.xml.sax.InputSource;

public class InputSource_16 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setPublicId("myPublicId");
        System.out.println("Public ID: " + inputSource.getPublicId());
    }
}
