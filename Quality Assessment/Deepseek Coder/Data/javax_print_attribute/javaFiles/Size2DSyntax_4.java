import javax.print.attribute.Size2DSyntax;

public class Size2DSyntax_4 {
    public static void main(String[] args) {
        Size2DSyntax size1 = new Size2DSyntax(10, 20);
        Size2DSyntax size2 = new Size2DSyntax(10, 20);
        Size2DSyntax size3 = new Size2DSyntax(30, 40);

        boolean isEqual1 = size1.equals(size2);
        boolean isEqual2 = size1.equals(size3);

        System.out.println("Is size1 equal to size2? " + isEqual1);
        System.out.println("Is size1 equal to size3? " + isEqual2);
    }
}
