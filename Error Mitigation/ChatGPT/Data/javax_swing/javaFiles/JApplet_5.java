import javax.swing.JApplet;
import javax.swing.JRootPane;

public class JApplet_5 extends JApplet {
    public static void main(String[] args) {
        JApplet_5 applet = new JApplet_5();
        JRootPane rootPane = applet.createRootPane();
        System.out.println("RootPane created: " + rootPane);
    }

    protected JRootPane createRootPane() {
        return new JRootPane();
    }
}
