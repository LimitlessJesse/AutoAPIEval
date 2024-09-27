import org.xml.sax.InputSource;

public class InputSource_10 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setPublicId("publicId");
        System.out.println(inputSource.getPublicId());
    }
}
