import javax.swing.LookAndFeel;

public class LookAndFeel_1 {
    public static void main(String[] args) {
        LookAndFeel lookAndFeel = new LookAndFeel() {
            @Override
            public String getName() {
                return "CDE/Motif";
            }
        };
        
        System.out.println("Look and feel name: " + lookAndFeel.getName());
    }
}
