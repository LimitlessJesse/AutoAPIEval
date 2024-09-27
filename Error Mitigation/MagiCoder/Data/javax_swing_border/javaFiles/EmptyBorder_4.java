import javax.swing.border.EmptyBorder;

public class EmptyBorder_4 {
    public static void main(String[] args) {
        EmptyBorder emptyBorder = new EmptyBorder(1, 2, 3, 4);
        boolean isBorderOpaque = emptyBorder.isBorderOpaque();
        System.out.println("Is border opaque? " + isBorderOpaque);
    }
}
