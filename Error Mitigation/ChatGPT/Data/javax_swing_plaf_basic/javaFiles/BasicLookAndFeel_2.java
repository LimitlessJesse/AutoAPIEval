import javax.swing.plaf.basic.BasicLookAndFeel;

public class BasicLookAndFeel_2 {
    public static void main(String[] args) {
        BasicLookAndFeel basicLookAndFeel = new BasicLookAndFeel() {
            @Override
            public void initialize() {
                // Perform initialization for the look and feel
                // Subclasses should do any one-time setup they need here
            }
        };
        basicLookAndFeel.initialize();
    }
}
