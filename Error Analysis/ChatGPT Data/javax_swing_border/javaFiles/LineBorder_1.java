import javax.swing.border.LineBorder;

public class LineBorder_1 {
    public static void main(String[] args) {
        LineBorder border = new LineBorder(java.awt.Color.BLACK, 2);
        int thickness = border.getThickness();
        System.out.println("Border thickness: " + thickness);
    }
}
