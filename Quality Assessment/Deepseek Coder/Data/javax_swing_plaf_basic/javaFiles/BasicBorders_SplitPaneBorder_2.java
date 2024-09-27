import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

public class BasicBorders_SplitPaneBorder_2 {
    public static void main(String[] args) {
        SplitPaneBorder border = new SplitPaneBorder();
        boolean isOpaque = border.isBorderOpaque();
        System.out.println("Is the border opaque? " + isOpaque);
    }
}
