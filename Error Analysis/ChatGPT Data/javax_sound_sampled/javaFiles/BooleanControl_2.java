import javax.sound.sampled.BooleanControl;

public class BooleanControl_2 {
    public static void main(String[] args) {
        // Create a BooleanControl object
        BooleanControl control = new BooleanControl(BooleanControl.Type.MUTE, false);

        // Set the value using setValue method
        control.setValue(true);

        // Check the new value
        boolean value = control.getValue();
        System.out.println("New value: " + value);
    }
}
