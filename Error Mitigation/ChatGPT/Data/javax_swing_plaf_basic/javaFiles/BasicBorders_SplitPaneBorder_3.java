import javax.swing.plaf.basic.BasicBorders;

public class BasicBorders_SplitPaneBorder_3 {
    public static void main(String[] args) {
        BasicBorders.SplitPaneBorder border = new BasicBorders.SplitPaneBorder();
        boolean isOpaque = border.isBorderOpaque();
        System.out.println("Border is opaque: " + isOpaque);
    }
}
