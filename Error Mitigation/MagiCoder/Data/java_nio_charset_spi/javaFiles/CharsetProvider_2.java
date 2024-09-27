import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

public class CharsetProvider_2 {
    public static void main(String[] args) {
        ServiceLoader<CharsetProvider> loader = ServiceLoader.load(CharsetProvider.class);
        for (CharsetProvider provider : loader) {
            Iterator<Charset> charsets = provider.charsets();
            while (charsets.hasNext()) {
                System.out.println(charsets.next());
            }
        }
    }
}
