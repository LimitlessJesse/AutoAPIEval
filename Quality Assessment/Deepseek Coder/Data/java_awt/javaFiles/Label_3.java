import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Label_3 {
    public static void main(String[] args) {
        Label label = new Label("Hello, World!");
        label.setAlignment(Label.CENTER);
        label.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        label.setSize(200, 200);
        label.setVisible(true);
    }
}
