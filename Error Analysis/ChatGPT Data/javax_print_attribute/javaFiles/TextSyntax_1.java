import javax.print.attribute.TextSyntax;

public class TextSyntax_1 {
    public static void main(String[] args) {
        TextSyntax text = new TextSyntax("Hello");
        String value = text.getValue();
        System.out.println("Value: " + value);
    }
}
