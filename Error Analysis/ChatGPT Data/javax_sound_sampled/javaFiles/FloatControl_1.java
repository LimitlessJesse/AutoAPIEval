import javax.sound.sampled.FloatControl;

public class FloatControl_1 {
    public static void main(String[] args) {
        FloatControl control = new FloatControl(FloatControl.Type.MASTER_GAIN, -80.0f, 6.0f, 0.1f, "Volume");
        float max = control.getMaximum();
        System.out.println("Maximum value: " + max);
    }
}
