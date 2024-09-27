import javax.print.attribute.TextSyntax;

public class TextSyntax_2 {
    public static void main(String[] args) {
        TextSyntax textSyntax = new TextSyntax("Hello, World!");
        String value = textSyntax.getValue();
        System.out.println(value);
    }
}
