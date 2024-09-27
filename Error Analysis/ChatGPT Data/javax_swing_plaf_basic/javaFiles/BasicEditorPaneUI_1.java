import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicEditorPaneUI;

public class BasicEditorPaneUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };
        
        BasicEditorPaneUI ui = new BasicEditorPaneUI();
        ui.installUI(component);
    }
}
