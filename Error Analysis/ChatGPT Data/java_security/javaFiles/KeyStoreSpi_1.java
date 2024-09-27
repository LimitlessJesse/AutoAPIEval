import java.security.KeyStoreSpi;
import java.util.Enumeration;

public class KeyStoreSpi_1 {
    public static void main(String[] args) {
        KeyStoreSpi keyStoreSpi = new CustomKeyStoreSpi(); // You would need to create a custom KeyStoreSpi implementation
        Enumeration<String> aliases = keyStoreSpi.engineAliases();
        
        while (aliases.hasMoreElements()) {
            String alias = aliases.nextElement();
            System.out.println(alias);
        }
    }
}
