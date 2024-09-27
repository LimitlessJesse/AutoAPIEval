import javax.sound.sampled.EnumControl;

public class EnumControl_2 {
    public static void main(String[] args) {
        EnumControl enumControl = new EnumControl(EnumControl.Type.MASTER_GAIN);
        Object value = enumControl.getValue();
        System.out.println("Current value: " + value);
    }
}
