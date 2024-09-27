import java.nio.charset.spi.CharsetProvider;
import java.nio.charset.Charset;
import java.util.Iterator;

public class CharsetProvider_2 {
    public static void main(String[] args) {
        CharsetProvider provider = new CustomCharsetProvider(); // CustomCharsetProvider is a custom implementation of CharsetProvider
        Iterator<Charset> charsetIterator = provider.charsets();
        
        while (charsetIterator.hasNext()) {
            Charset charset = charsetIterator.next();
            System.out.println(charset.displayName());
        }
    }
}
