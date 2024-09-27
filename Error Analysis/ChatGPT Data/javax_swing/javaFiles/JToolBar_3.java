import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.Action;

public class JToolBar_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JToolBar Example");
        JToolBar toolBar = new JToolBar();
        
        Action action = new CustomAction("Click Me");
        JButton button = new JButton(action);
        toolBar.add(button);
        
        frame.add(toolBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

class CustomAction extends AbstractAction {
    public CustomAction(String text) {
        super(text);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }
}
