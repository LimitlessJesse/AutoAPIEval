import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayout_15 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        GridLayout gridLayout = new GridLayout(2, 2);
        frame.setLayout(gridLayout);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.pack();
        frame.setVisible(true);

        // Remove button3 from the layout
        gridLayout.removeLayoutComponent(button3);

        // The button3 will no longer be displayed
        frame.repaint();
    }
}
