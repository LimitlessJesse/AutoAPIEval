import javax.print.attribute.ResolutionSyntax;

public class ResolutionSyntax_4 {
    public static void main(String[] args) {
        ResolutionSyntax resolution = new ResolutionSyntax(1024, 768);
        int hashCode = resolution.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
