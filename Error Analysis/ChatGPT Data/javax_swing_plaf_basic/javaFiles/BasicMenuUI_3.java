import javax.swing.plaf.basic.BasicMenuUI;
import javax.swing.*;

public class BasicMenuUI_3 {
    public static void main(String[] args) {
        JMenu menu = new JMenu("File");
        BasicMenuUI basicMenuUI = new BasicMenuUI();
        basicMenuUI.installListeners(menu);
    }
}
