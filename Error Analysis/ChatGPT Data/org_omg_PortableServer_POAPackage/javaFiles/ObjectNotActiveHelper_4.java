import org.omg.PortableServer.POAPackage.ObjectNotActiveHelper;

public class ObjectNotActiveHelper_4 {
    public static void main(String[] args) {
        try {
            ObjectNotActiveHelper.read(inputStream);
            System.out.println("ObjectNotActive read successful");
        } catch (Exception e) {
            System.out.println("Error reading ObjectNotActive: " + e.getMessage());
        }
    }
}
