import java.security.Provider;

public class Provider_1 {
    public static void main(String[] args) {
        Provider provider = new Provider("myProvider", 1.0, "myProvider info") {};
        String name = provider.getName();
        System.out.println("Provider name: " + name);
    }
}
