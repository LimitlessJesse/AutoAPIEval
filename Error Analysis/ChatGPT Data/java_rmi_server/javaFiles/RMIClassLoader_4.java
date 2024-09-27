import java.rmi.server.RMIClassLoader;

public class RMIClassLoader_4 {
    public static void main(String[] args) {
        ClassLoader loader = Main.class.getClassLoader();
        Object securityContext = RMIClassLoader.getSecurityContext(loader);
        System.out.println("Security Context: " + securityContext);
    }
}
