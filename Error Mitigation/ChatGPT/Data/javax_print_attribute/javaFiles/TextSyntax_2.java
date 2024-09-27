import javax.print.attribute.TextSyntax;

public class TextSyntax_2 {
    public static void main(String[] args) {
        TextSyntax textAttribute = new TextSyntax("example");
        int hashCode = textAttribute.hashCode();
        System.out.println("Hashcode value: " + hashCode);
    }
}
