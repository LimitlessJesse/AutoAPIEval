import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class BasicOptionPaneUI_4 {
    public static void main(String[] args) {
        BasicOptionPaneUI basicOptionPaneUI = new BasicOptionPaneUI();
        JOptionPane op = new JOptionPane();
        basicOptionPaneUI.selectInitialValue(op);
    }
}
