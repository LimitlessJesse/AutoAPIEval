import javax.naming.*;

public class CompositeName_4 {
    public static void main(String[] args) throws NamingException {
        CompositeName compositeName = new CompositeName("com", "example", "test");
        System.out.println(compositeName.toString());
    }
}
