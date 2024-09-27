import java.lang.Package;

public class Package_2 {
    public static void main(String[] args) {
        Package pkg = Package_2.class.getPackage();
        String title = pkg.getImplementationTitle();
        System.out.println("Implementation Title: " + title);
    }
}
