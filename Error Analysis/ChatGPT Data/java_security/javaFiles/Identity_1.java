import java.security.Identity;

public class Identity_1 {
    public static void main(String[] args) {
        Identity identity = new Identity() {
            @Override
            public String getName() {
                return "John Doe";
            }
        };

        System.out.println(identity.getName());
    }
}
