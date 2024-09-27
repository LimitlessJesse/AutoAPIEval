import java.lang.Package;

public class Package_5 {
    public static void main(String[] args) {
        Package pkg = Package_5.class.getPackage();
        String version = pkg.getSpecificationVersion();
        System.out.println("Specification Version: " + version);
    }
}
