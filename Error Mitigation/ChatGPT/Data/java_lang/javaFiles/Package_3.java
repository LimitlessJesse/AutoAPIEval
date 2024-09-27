import java.lang.Package;

public class Package_3 {
    public static void main(String[] args) {
        Package pkg = Package_3.class.getPackage();
        String version = pkg.getImplementationVersion();
        System.out.println("Implementation version: " + version);
    }
}
