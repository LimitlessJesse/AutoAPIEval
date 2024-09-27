import java.rmi.server.RMIClassLoader;
import java.net.MalformedURLException;

public class RMIClassLoader_1 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = RMIClassLoader.loadClass("java.lang.String");
            System.out.println(clazz.getName());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
