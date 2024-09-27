import javax.swing.border.TitledBorder;
import java.awt.Font;

public class TitledBorder_21 {
    public static void main(String[] args) {
        TitledBorder border = new TitledBorder("Title");
        Font font = new Font("Arial", Font.BOLD, 12);
        border.setTitleFont(font);
        System.out.println("Title font: " + border.getTitleFont());
    }
}
