import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class TitledBorder_16 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        TitledBorder titledBorder = new TitledBorder("Title");
        panel.setBorder(titledBorder);

        Border border = panel.getBorder();
        if (border instanceof TitledBorder) {
            TitledBorder titledBorder2 = (TitledBorder) border;
            System.out.println("Title: " + titledBorder2.getTitle());
        }
    }
}
