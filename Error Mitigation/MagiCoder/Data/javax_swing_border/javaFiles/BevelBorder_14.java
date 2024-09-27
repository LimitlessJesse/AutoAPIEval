import javax.swing.border.BevelBorder;

public class BevelBorder_14 {
    public static void main(String[] args) {
        BevelBorder bevelBorder = new BevelBorder(BevelBorder.LOWERED);
        boolean isBorderOpaque = bevelBorder.isBorderOpaque();
        System.out.println("Is border opaque? " + isBorderOpaque);
    }
}
