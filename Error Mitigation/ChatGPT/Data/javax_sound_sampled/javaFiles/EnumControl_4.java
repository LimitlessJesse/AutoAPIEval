import javax.sound.sampled.EnumControl;

public class EnumControl_4 {
    public static void main(String[] args) {
        EnumControl enumControl = new EnumControl(EnumControl.Type.MASTER_GAIN);
        System.out.println(enumControl.toString());
    }
}
