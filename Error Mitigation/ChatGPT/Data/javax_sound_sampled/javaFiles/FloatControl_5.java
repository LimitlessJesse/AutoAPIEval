import javax.sound.sampled.FloatControl;

public class FloatControl_5 {
    public static void main(String[] args) {
        FloatControl control = new FloatControl();
        float value = control.getValue();
        System.out.println("Current value: " + value);
    }
}
