import javax.swing.border.TitledBorder;
import javax.swing.border.Border;

public class TitledBorder_2 {
    public static void main(String[] args) {
        TitledBorder titledBorder = new TitledBorder("Title");
        Border border = titledBorder.getBorder();
        System.out.println(border);
    }
}
