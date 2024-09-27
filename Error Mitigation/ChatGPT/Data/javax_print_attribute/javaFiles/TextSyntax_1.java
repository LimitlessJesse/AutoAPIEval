import javax.print.attribute.TextSyntax;

public class TextSyntax_1 {
    public static void main(String[] args) {
        TextSyntax textAttribute = new TextSyntax("Sample Text");
        String value = textAttribute.getValue();
        System.out.println("Text Attribute Value: " + value);
    }
}
