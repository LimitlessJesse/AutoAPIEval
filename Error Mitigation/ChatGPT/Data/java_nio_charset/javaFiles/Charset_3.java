import java.nio.charset.Charset;

public class Charset_3 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        System.out.println("Charset name: " + charset.name());
    }
}
