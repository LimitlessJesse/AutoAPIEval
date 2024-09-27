import javax.sound.sampled.Control;

public class Control_Type_4 {
    public static void main(String[] args) {
        Control.Type type = Control.Type.MASTER_GAIN;
        int hashCode = type.hashCode();
        System.out.println("Hash code for Control.Type.MASTER_GAIN: " + hashCode);
    }
}
