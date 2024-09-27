import javax.print.attribute.TextSyntax;

public class TextSyntax_4 {
    public static void main(String[] args) {
        TextSyntax textSyntax1 = new TextSyntax("Hello");
        TextSyntax textSyntax2 = new TextSyntax("Hello");

        boolean isEqual = textSyntax1.equals(textSyntax2);

        System.out.println("Are the two TextSyntax objects equal? " + isEqual);
    }
}
