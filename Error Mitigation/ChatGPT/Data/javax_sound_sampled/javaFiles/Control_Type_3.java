import javax.sound.sampled.Control;

public class Control_Type_3 {
    public static void main(String[] args) {
        Control.Type type = new Control.Type("SampleType");
        int hashCode = type.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
