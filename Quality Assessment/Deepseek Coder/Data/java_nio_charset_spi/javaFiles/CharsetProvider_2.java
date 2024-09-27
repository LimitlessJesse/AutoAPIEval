import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Iterator;

public class CharsetProvider_2 {
    public static void main(String[] args) {
        Iterator<CharsetProvider> providers = Charset.providers().iterator();
        while (providers.hasNext()) {
            CharsetProvider provider = providers.next();
            System.out.println(provider.charsetForName("UTF-8"));
        }
    }
}
