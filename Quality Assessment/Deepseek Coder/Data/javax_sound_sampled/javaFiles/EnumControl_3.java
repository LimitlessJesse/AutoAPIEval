import javax.sound.sampled.*;

public class EnumControl_3 {
    public static void main(String[] args) {
        try {
            // Create a Mixer.Info object
            Mixer.Info info = Mixer.Info.class.getDeclaredField("LINE1").get(null);

            // Get a Mixer
            Mixer mixer = AudioSystem.getMixer(info);

            // Get an EnumControl
            EnumControl control = (EnumControl) mixer.getControl(new Class[]{EnumControl.Type.MASTER_GAIN});

            // Get the current value of the control
            float value = control.getValue();

            // Print the value
            System.out.println("Current value: " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
