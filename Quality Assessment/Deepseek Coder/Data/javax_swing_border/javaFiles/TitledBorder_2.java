import javax.swing.*;
import javax.swing.border.TitledBorder;

public class TitledBorder_2 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        TitledBorder border = BorderFactory.createTitledBorder("Title");
        panel.setBorder(border);
        System.out.println(border.getTitle());
    }
}
