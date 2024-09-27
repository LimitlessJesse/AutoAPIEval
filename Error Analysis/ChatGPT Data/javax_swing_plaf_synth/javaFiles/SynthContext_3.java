import javax.swing.plaf.synth.SynthContext;
import java.awt.Region;

public class SynthContext_3 {
    public static void main(String[] args) {
        SynthContext context = new SynthContext();
        Region region = context.getRegion();
        System.out.println(region);
    }
}
