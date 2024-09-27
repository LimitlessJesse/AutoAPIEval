import javax.sound.sampled.Control;

public class Control_Type_1 {
    public static void main(String[] args) {
        Control.Type controlType = new Control.Type("Volume");
        System.out.println(controlType.toString());
    }
}
