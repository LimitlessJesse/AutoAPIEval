import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;

public class BorderUIResource_2 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.setBorder(BorderFactory.createLineBorder(Color.RED));

        UIManager.LookAndFeelInfo[] lafs = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : lafs) {
            try {
                UIManager.setLookAndFeel(info.getClassName());
                System.out.println("Current Look and Feel: " + info.getName());

                Insets insets = BorderUIResource.getBorderInsets(button);
                System.out.println("Insets: " + insets);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
