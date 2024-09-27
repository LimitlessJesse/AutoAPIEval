import javax.print.attribute.Size2DSyntax;

public class Size2DSyntax_3 {
    public static void main(String[] args) {
        Size2DSyntax size1 = new Size2DSyntax(100, 200);
        Size2DSyntax size2 = new Size2DSyntax(100, 200);
        
        System.out.println(size1.equals(size2)); // Output: true
    }
}
