import javax.sound.sampled.BooleanControl;

public class BooleanControl_5 {
    public static void main(String[] args) {
        BooleanControl control = new BooleanControl(BooleanControl.Type.MUTE, false);
        System.out.println(control.toString());
    }
}
