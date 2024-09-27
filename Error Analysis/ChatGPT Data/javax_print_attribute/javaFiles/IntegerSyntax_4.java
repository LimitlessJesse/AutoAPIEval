import javax.print.attribute.IntegerSyntax;

public class IntegerSyntax_4 {
    public static void main(String[] args) {
        IntegerSyntax integerSyntax = new IntegerSyntax(123);
        int hashCode = integerSyntax.hashCode();
        System.out.println("Hash Code: " + hashCode);
    }
}
