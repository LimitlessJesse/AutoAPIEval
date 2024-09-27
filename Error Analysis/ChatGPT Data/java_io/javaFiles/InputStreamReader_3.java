import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class InputStreamReader_3 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        Charset encoding = isr.getEncoding();

        System.out.println("Current encoding: " + encoding);
    }
}
