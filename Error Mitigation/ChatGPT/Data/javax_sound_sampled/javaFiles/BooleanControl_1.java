import javax.sound.sampled.BooleanControl;

public class BooleanControl_1 {
    public static void main(String[] args) {
        BooleanControl control = new BooleanControl(BooleanControl.Type.MUTE, true);
        boolean value = control.getValue();
        System.out.println("Current value: " + value);
    }
}
