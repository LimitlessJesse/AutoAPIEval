import java.lang.Package;

public class Package_2 {
    public static void main(String[] args) {
        Package[] packages = Package.getPackages();
        for (Package pkg : packages) {
            System.out.println(pkg.getName());
        }
    }
}
