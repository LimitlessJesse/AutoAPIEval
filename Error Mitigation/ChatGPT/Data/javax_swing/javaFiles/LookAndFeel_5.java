import javax.swing.LookAndFeel;

public class LookAndFeel_5 {
    public static void main(String[] args) {
        LookAndFeel lookAndFeel = new LookAndFeel() {
            @Override
            public boolean isNativeLookAndFeel() {
                // Add your implementation here
                return false;
            }
        };
        
        System.out.println(lookAndFeel.isNativeLookAndFeel());
    }
}
