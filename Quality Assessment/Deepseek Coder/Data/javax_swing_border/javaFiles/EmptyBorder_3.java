import javax.swing.border.EmptyBorder;

public class EmptyBorder_3 {
    public static void main(String[] args) {
        EmptyBorder border = new EmptyBorder(10, 10, 10, 10);
        boolean isOpaque = border.isBorderOpaque();
        System.out.println("Is border opaque? " + isOpaque);
    }
}
