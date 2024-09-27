import javax.sound.sampled.EnumControl;

public class EnumControl_1 {
    public static void main(String[] args) {
        EnumControl enumControl = new EnumControl(EnumControl.Type.MASTER_GAIN);
        Object[] values = enumControl.getValues();
        
        System.out.println("Possible values:");
        for (Object value : values) {
            System.out.println(value);
        }
    }
}
