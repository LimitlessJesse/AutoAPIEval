import javax.swing.LookAndFeel;

public class LookAndFeel_2 {
    public static void main(String[] args) {
        LookAndFeel lookAndFeel = new LookAndFeel() {
            @Override
            public String getDescription() {
                return "The CDE/Motif Look and Feel";
            }
        };
        
        System.out.println(lookAndFeel.getDescription());
    }
}
