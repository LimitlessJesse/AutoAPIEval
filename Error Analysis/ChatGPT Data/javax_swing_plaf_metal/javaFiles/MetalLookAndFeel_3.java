import javax.swing.plaf.metal.MetalLookAndFeel;

public class MetalLookAndFeel_3 {
    public static void main(String[] args) {
        MetalLookAndFeel metalLookAndFeel = new MetalLookAndFeel();
        boolean isNativeLookAndFeel = metalLookAndFeel.isNativeLookAndFeel();
        System.out.println("Is native look and feel: " + isNativeLookAndFeel);
    }
}
