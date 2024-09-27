import javax.naming.CompoundName;
import javax.naming.InvalidNameException;
import java.util.Enumeration;
import java.util.Properties;

public class CompoundName_2 {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            CompoundName name = new CompoundName("example.com", properties);

            // Adding a suffix to the name
            CompoundName suffix = new CompoundName("www", properties);
            name.addAll(suffix);

            System.out.println("Updated Name: " + name);
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
