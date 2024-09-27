import java.lang.Package;

public class Package_4 {
    public static void main(String[] args) {
        Package pkg = Package.getPackage("java.lang");
        String version = pkg.getSpecificationVersion();
        System.out.println("Java Specification Version: " + version);
    }
}
