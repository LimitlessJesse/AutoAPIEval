import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class BasicOptionPaneUI_5 {
    public static void main(String[] args) {
        JOptionPane optionPane = new JOptionPane();
        selectInitialValue(optionPane);
    }

    public static void selectInitialValue(JOptionPane optionPane) {
        BasicOptionPaneUI ui = (BasicOptionPaneUI) optionPane.getUI();
        ui.selectInitialValue(optionPane);
    }
}
