import javax.swing.border.EmptyBorder;

public class EmptyBorder_2 {
    public static void main(String[] args) {
        EmptyBorder emptyBorder = new EmptyBorder(10, 10, 10, 10);
        boolean isOpaque = emptyBorder.isBorderOpaque();
        System.out.println("Is Border Opaque: " + isOpaque);
    }
}
