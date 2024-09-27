import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GroupLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Link Size Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(button1)
                .addComponent(button2)
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(button1)
                .addComponent(button2)
        );

        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addComponent(button1).linkSize(button1, button2);
        hGroup.addComponent(button2);
        
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(button1)
            .addComponent(button2));
        
        layout.setHorizontalGroup(hGroup);
        layout.setVerticalGroup(vGroup);

        frame.pack();
        frame.setVisible(true);
    }
}
