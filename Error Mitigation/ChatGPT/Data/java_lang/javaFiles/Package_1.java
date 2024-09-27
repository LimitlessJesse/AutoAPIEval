import java.lang.Package;

public class Package_1 {
    public static void main(String[] args) {
        Package pkg = Package_1.class.getPackage();
        String packageName = pkg.getName();
        System.out.println("Package name: " + packageName);
    }
}
