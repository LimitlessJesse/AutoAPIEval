import org.xml.sax.InputSource;

public class InputSource_15 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setPublicId("publicIdExample");
        System.out.println(inputSource.getPublicId());
    }
}
