import javax.management.ObjectName;

public class ObjectName_3 {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("test:type=example");
            String domain = objectName.getDomain();
            System.out.println("Domain: " + domain);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
