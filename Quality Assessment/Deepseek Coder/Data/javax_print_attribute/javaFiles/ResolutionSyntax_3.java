import javax.print.attribute.ResolutionSyntax;

public class ResolutionSyntax_3 {
    public static void main(String[] args) {
        ResolutionSyntax resolution1 = new ResolutionSyntax(100, 200);
        ResolutionSyntax resolution2 = new ResolutionSyntax(100, 200);

        boolean isEqual = resolution1.equals(resolution2);

        System.out.println("Are the two resolutions equal? " + isEqual);
    }
}
