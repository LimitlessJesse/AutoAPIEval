import javax.print.attribute.TextSyntax;

public class TextSyntax_3 {
    public static void main(String[] args) {
        TextSyntax text1 = new TextSyntax("Hello");
        TextSyntax text2 = new TextSyntax("Hello");

        boolean result = text1.equals(text2);
        System.out.println(result);  // Output: true
    }
}
