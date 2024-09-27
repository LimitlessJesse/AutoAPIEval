import javax.print.attribute.ResolutionSyntax;

public class ResolutionSyntax_5 {
    public static void main(String[] args) {
        ResolutionSyntax resolution = new ResolutionSyntax(300, 300, ResolutionSyntax.DPI);
        System.out.println(resolution.toString());
    }
}
