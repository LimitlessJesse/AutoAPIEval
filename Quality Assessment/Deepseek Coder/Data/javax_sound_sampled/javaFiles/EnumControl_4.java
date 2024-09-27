import javax.sound.sampled.EnumControl;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Control;

public class EnumControl_4 {
    public static void main(String[] args) {
        EnumControl control = FloatControl.Type.MASTER_GAIN.createEnumControl();
        ((Control) control).setValue(FloatControl.Type.MASTER_GAIN.limit(1.0f));
    }
}
