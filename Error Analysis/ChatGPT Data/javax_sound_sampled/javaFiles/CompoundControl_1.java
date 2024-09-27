import javax.sound.sampled.CompoundControl;
import javax.sound.sampled.Control;
import java.util.List;

public class CompoundControl_1 {
    public static void main(String[] args) {
        CompoundControl compoundControl = new CompoundControl(null, new Control[0]);
        Control[] controls = compoundControl.getMemberControls();

        for (int i = 0; i < controls.length; i++) {
            System.out.println("Control #" + i + ": " + controls[i]);
        }
    }
}
