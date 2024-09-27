import javax.swing.border.BevelBorder;

public class BevelBorder_1 {
    public static void main(String[] args) {
        BevelBorder bevelBorder = new BevelBorder(BevelBorder.RAISED);
        int bevelType = bevelBorder.getBevelType();
        System.out.println("Bevel Type: " + bevelType);
    }
}
