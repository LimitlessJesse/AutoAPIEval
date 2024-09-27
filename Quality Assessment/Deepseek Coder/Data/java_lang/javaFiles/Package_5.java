import java.lang.reflect.Field;

public class Package_5 {
    public static void main(String[] args) throws Exception {
        Field f = Class.class.getDeclaredField("package");
        f.setAccessible(true);
        Package pkg = f.get(Package_5.class);
        String version = pkg.getImplementationVersion();
        System.out.println("Version: " + version);
    }
}
