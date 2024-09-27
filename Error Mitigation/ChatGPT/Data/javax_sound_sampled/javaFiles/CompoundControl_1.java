import javax.sound.sampled.CompoundControl;
import javax.sound.sampled.Control;

public class CompoundControl_1 {
    public static void main(String[] args) {
        CompoundControl compoundControl = new CompoundControl(null, new Control[]{});
        Control[] memberControls = compoundControl.getMemberControls();
        for(Control control : memberControls) {
            System.out.println(control);
        }
    }
}
