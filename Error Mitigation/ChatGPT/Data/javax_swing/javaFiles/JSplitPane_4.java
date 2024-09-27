import javax.swing.*;

public class JSplitPane_4 {
    public static void main(String[] args) {
        JSplitPane splitPane = new JSplitPane();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        splitPane.setLeftComponent(panel1);
        splitPane.setRightComponent(panel2);
    }
}
