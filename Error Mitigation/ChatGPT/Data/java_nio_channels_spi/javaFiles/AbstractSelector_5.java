import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;

public class AbstractSelector_5 {
    public static void main(String[] args) {
        AbstractSelector selector = new AbstractSelector() {
            @Override
            public SelectorProvider provider() {
                return super.provider();
            }
        };
        
        SelectorProvider provider = selector.provider();
        System.out.println("Provider: " + provider);
    }
}
