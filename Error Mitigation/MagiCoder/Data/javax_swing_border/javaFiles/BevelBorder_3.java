import javax.swing.border.BevelBorder;

public class BevelBorder_3 {
    public static void main(String[] args) {
        BevelBorder bevelBorder = BevelBorder.RAISED;
        int bevelType = bevelBorder.getBevelType();
        System.out.println("Bevel Type: " + bevelType);
    }
}
