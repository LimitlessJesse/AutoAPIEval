import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import javax.naming.NamingException;
import javax.naming.Name;

public class InitialDirContext_1 {
    public static void main(String[] args) {
        try {
            InitialDirContext context = new InitialDirContext();
            Name name = context.getNameParser("").parse("exampleName");
            Attributes attributes = context.getAttributes(name);
            System.out.println(attributes);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
