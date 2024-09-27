import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.InputStream;

public class SynthLookAndFeel_1 {
    public static void main(String[] args) {
        SynthLookAndFeel lookAndFeel = new SynthLookAndFeel();
        InputStream stream = Main.class.getResourceAsStream("/path/to/synth.xml");
        try {
            lookAndFeel.load(stream, Main.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
