import java.awt.Choice;
import java.awt.Frame;

public class Choice_2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Choice Example");
        Choice choice = new Choice();

        // Add items to the Choice
        choice.add("Item 1");
        choice.add("Item 2");
        choice.add("Item 3");

        frame.add(choice);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
