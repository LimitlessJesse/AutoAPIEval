import javax.management.ObjectName;

public class ObjectName_7 {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("com.example:type=Test,name=TestBean");
            String domain = objectName.getDomain();
            System.out.println("Domain: " + domain);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
