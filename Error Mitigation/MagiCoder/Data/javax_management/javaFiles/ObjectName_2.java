import javax.management.ObjectName;

public class ObjectName_2 {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("com.example:type=Test,name=TestName");
            String canonicalName = objectName.getCanonicalName();
            System.out.println(canonicalName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
