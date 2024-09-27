import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.InputStream;
import java.text.ParseException;

public class SynthLookAndFeel_1 {
    public static void main(String[] args) {
        SynthLookAndFeel synthLookAndFeel = new SynthLookAndFeel();
        InputStream input = SynthLookAndFeel_1.class.getResourceAsStream("synthStyles.xml");
        Class<?> resourceBase = SynthLookAndFeel_1.class;
        
        try {
            synthLookAndFeel.load(input, resourceBase);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
