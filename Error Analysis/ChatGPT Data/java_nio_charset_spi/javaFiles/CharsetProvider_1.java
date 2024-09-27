import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

public class CharsetProvider_1 {
    public static void main(String[] args) {
        CharsetProvider provider = CharsetProvider.provider();
        Iterator<Charset> charsets = provider.charsets();
        
        while(charsets.hasNext()) {
            Charset charset = charsets.next();
            System.out.println(charset.displayName());
        }
    }
}
