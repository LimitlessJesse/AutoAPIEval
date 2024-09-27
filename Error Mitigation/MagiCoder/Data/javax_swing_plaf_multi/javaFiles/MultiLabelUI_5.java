import javax.swing.*;
import javax.swing.plaf.multi.MultiLabelUI;
import java.awt.*;

public class MultiLabelUI_5 {
    public static void main(String[] args) {
        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");

        MultiLabelUI multiLabelUI = new MultiLabelUI();
        multiLabelUI.paint(label1.getGraphics(), label1);
        multiLabelUI.paint(label2.getGraphics(), label2);
    }
}
