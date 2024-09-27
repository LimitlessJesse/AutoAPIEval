import java.lang.Package;

public class Package_1 {
    public static void main(String[] args) {
        Package pkg = Package.getPackage("java.util");
        System.out.println("Package Name: " + pkg.getName());
        System.out.println("Specification Version: " + pkg.getSpecificationVersion());
        System.out.println("Implementation Version: " + pkg.getImplementationVersion());
    }
}
