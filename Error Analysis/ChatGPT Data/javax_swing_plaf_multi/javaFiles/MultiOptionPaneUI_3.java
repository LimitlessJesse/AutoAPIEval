import javax.swing.JOptionPane;
import javax.swing.plaf.multi.MultiOptionPaneUI;

public class MultiOptionPaneUI_3 {
    public static void main(String[] args) {
        MultiOptionPaneUI multiOptionPaneUI = new MultiOptionPaneUI();
        JOptionPane optionPane = new JOptionPane();
        multiOptionPaneUI.selectInitialValue(optionPane);
    }
}
