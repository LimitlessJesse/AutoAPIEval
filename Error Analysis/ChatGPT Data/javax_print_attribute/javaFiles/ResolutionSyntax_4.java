import javax.print.attribute.ResolutionSyntax;

public class ResolutionSyntax_4 {
    public static void main(String[] args) {
        ResolutionSyntax resolution = new ResolutionSyntax(300, 300, ResolutionSyntax.DPI);
        System.out.println("Hash code: " + resolution.hashCode());
    }
}
