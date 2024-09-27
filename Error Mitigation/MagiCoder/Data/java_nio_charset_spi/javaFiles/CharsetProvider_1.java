import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Iterator;

public class CharsetProvider_1 {
    public static void main(String[] args) {
        CharsetProvider provider = Charset.availableCharsets().values().iterator().next();
        Charset charset = provider.charsetForName("UTF-8");
        if (charset!= null) {
            System.out.println("Charset found: " + charset.displayName());
        } else {
            System.out.println("Charset not found");
        }
    }
}
