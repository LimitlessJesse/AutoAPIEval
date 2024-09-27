import javax.print.attribute.ResolutionSyntax;

public class ResolutionSyntax_3 {
    public static void main(String[] args) {
        ResolutionSyntax resolution1 = new ResolutionSyntax(300, 300, ResolutionSyntax.DPI);
        ResolutionSyntax resolution2 = new ResolutionSyntax(300, 300, ResolutionSyntax.DPI);

        boolean isEqual = resolution1.equals(resolution2);
        System.out.println("Are resolutions equal? " + isEqual);
    }
}
