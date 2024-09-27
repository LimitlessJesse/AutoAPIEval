import javax.print.attribute.TextSyntax;

public class TextSyntax_2 {
    public static void main(String[] args) {
        TextSyntax text = new TextSyntax("example text");
        int hashCode = text.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
