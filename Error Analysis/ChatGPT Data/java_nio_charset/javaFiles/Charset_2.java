import java.nio.charset.Charset;

public class Charset_2 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        System.out.println("Charset name: " + charset.name());
        System.out.println("Charset display name: " + charset.displayName());
        System.out.println("Charset aliases: " + charset.aliases());
    }
}
