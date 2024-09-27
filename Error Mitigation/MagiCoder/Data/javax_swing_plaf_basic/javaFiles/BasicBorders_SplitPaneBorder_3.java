import javax.swing.plaf.basic.BasicBorders;

public class BasicBorders_SplitPaneBorder_3 {
    public static void main(String[] args) {
        BasicBorders.SplitPaneBorder splitPaneBorder = new BasicBorders.SplitPaneBorder();
        boolean isOpaque = splitPaneBorder.isBorderOpaque();
        System.out.println("Is border opaque? " + isOpaque);
    }
}
