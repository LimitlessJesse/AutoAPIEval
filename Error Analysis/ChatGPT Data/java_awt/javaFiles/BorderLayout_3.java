import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;

public class BorderLayout_3 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        BorderLayout layout = new BorderLayout();

        Component comp = new Component() {
        };

        layout.removeLayoutComponent(comp);
    }
}
