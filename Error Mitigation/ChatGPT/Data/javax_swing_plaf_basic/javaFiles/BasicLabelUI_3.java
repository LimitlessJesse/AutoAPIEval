import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.*;
import java.awt.*;

public class BasicLabelUI_3 {
    public static void main(String[] args) {
        BasicLabelUI basicLabelUI = new BasicLabelUI();
        JLabel label = new JLabel("Example Label");
        Graphics graphics = new Graphics();
        
        basicLabelUI.paint(graphics, label);
    }
}
