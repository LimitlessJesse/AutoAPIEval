import java.rmi.server.RMIClassLoader;

public class RMIClassLoader_3 {
    public static void main(String[] args) {
        String codebase = "http://localhost:8080/classes/";
        ClassLoader classLoader = RMIClassLoader.getClassLoader(codebase);
        System.out.println("Class loader for codebase " + codebase + ": " + classLoader);
    }
}
