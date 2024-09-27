import javax.swing.border.BevelBorder;

public class BevelBorder_1 {
    public static void main(String[] args) {
        BevelBorder border = new BevelBorder(BevelBorder.RAISED);
        int bevelType = border.getBevelType();
        System.out.println("Bevel Type: " + bevelType);
    }
}
