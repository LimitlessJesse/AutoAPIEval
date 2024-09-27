import java.nio.charset.Charset;

public class Charset_4 {
    public static void main(String[] args) {
        Charset charset1 = Charset.forName("UTF-8");
        Charset charset2 = Charset.forName("ISO-8859-1");

        boolean isContained = charset1.contains(charset2);
        System.out.println("Charset2 is contained in Charset1: " + isContained);
    }
}
