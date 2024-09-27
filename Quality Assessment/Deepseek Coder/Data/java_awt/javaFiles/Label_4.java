import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Label_4 {
    public static void main(String[] args) {
        // Create a new label
        Label label = new Label("Hello, World!");

        // Set the alignment of the label
        label.setAlignment(Label.CENTER);

        // Get the alignment of the label
        int alignment = label.getAlignment();

        // Print the alignment
        System.out.println("Alignment: " + alignment);

        // Add the label to the frame
        label.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
