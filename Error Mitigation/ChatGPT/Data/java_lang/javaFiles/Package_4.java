import java.lang.Package;

public class Package_4 {
    public static void main(String[] args) {
        Package pkg = Package_4.class.getPackage();
        String specificationTitle = pkg.getSpecificationTitle();
        System.out.println("Specification Title: " + specificationTitle);
    }
}
