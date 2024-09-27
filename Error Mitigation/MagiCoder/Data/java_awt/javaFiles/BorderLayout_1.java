import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayout_1 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
