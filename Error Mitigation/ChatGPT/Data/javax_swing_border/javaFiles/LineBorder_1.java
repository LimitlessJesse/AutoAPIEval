import javax.swing.border.LineBorder;

public class LineBorder_1 {
    public static void main(String[] args) {
        LineBorder lineBorder = new LineBorder();
        int thickness = lineBorder.getThickness();
        System.out.println("Border thickness: " + thickness);
    }
}
