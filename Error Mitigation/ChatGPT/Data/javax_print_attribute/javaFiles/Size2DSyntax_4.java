import javax.print.attribute.Size2DSyntax;

public class Size2DSyntax_4 {
    public static void main(String[] args) {
        Size2DSyntax size = new Size2DSyntax(10, 20, Size2DSyntax.MM);
        int hashCode = size.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
