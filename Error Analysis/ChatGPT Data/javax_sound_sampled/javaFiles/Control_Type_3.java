import javax.sound.sampled.Control;

public class Control_Type_3 {
    public static void main(String[] args) {
        Control.Type controlType = Control.Type.MUTE;
        String toStringResult = controlType.toString();
        System.out.println(toStringResult);
    }
}
