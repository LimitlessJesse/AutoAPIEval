import javax.print.attribute.IntegerSyntax;

public class IntegerSyntax_3 {
    public static void main(String[] args) {
        IntegerSyntax integerAttribute = new IntegerSyntax(10);
        int hashCode = integerAttribute.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
