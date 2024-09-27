import org.xml.sax.InputSource;

public class InputSource_5 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setEncoding("UTF-8");
        System.out.println("Character encoding set to: " + inputSource.getEncoding());
    }
}
