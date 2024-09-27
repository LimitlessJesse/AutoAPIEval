import javax.swing.border.BevelBorder;

public class BevelBorder_2 {
    public static void main(String[] args) {
        BevelBorder border = new BevelBorder(BevelBorder.RAISED);
        System.out.println("Highlight Outer Color: " + border.getHighlightOuterColor());
    }
}
