import java.rmi.Naming;

public class Naming_3 {
    public static void main(String[] args) {
        try {
            // Assuming that the object is already bound to a name
            String name = "rmi://localhost/MyObject";
            Naming.unbind(name);
            System.out.println("Successfully unbound the object with name: " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
