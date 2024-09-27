import javax.print.attribute.TextSyntax;

public class TextSyntax_3 {
    public static void main(String[] args) {
        TextSyntax text1 = new TextSyntax("example", "en_US");
        TextSyntax text2 = new TextSyntax("example", "en_US");

        boolean result = text1.equals(text2);
        System.out.println("Are text1 and text2 equivalent? " + result);
    }
}
