import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GroupLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AutoCreateContainerGaps Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);
        
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(button1)
                .addComponent(button2)
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(button1)
                .addComponent(button2)
        );
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
