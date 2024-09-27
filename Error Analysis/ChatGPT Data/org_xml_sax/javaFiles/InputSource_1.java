import org.xml.sax.InputSource;

public class InputSource_1 {
    public static void main(String[] args) {
        InputSource inputSource = new InputSource();
        inputSource.setEncoding("UTF-8");
        
        System.out.println("Encoding set to: " + inputSource.getEncoding());
    }
}
