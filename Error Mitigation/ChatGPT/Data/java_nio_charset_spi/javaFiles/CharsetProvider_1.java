import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;

public class CharsetProvider_1 {
    public static void main(String[] args) {
        CharsetProvider provider = CharsetProvider.provider();
        Charset charset = provider.charsetForName("UTF-8");
        System.out.println(charset);
    }
}
