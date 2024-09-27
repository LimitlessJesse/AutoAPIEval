import javax.sound.sampled.BooleanControl;

public class BooleanControl_2 {
    public static void main(String[] args) {
        BooleanControl control = new BooleanControl(BooleanControl.Type.MUTE, false);
        System.out.println("Current value: " + control.getValue());
        
        control.setValue(true);
        System.out.println("New value: " + control.getValue());
    }
}
