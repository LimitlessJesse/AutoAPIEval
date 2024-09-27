import org.xml.sax.InputSource;

public class InputSource_4 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setPublicId("sample-public-id");
        
        System.out.println("Public Id set: " + inputSource.getPublicId());
    }
}
