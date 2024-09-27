import javax.swing.border.BevelBorder;

public class BevelBorder_5 {
    public static void main(String[] args) {
        BevelBorder bevelBorder = new BevelBorder(BevelBorder.RAISED);
        System.out.println("Outer shadow color: " + bevelBorder.getShadowOuterColor());
    }
}
