import javax.swing.plaf.basic.BasicLookAndFeel;

public class BasicLookAndFeel_1 {
    public static void main(String[] args) {
        uninitialize();
    }

    public static void uninitialize() {
        BasicLookAndFeel basicLookAndFeel = new BasicLookAndFeel();
        basicLookAndFeel.uninitialize();
    }
}
