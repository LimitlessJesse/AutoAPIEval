import javax.naming.CompositeName;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.directory.InitialDirContext;

public class CompositeName_2 {
    public static void main(String[] args) {
        try {
            InitialDirContext ictx = new InitialDirContext();
            NameParser np = ictx.getAttributes().get().getNameParser();
            Name n = np.parse("dc=example,dc=com");
            CompositeName cn = (CompositeName) n;
            String name = cn.get(0);
            System.out.println(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
