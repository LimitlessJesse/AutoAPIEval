import javax.sound.sampled.Control;

public class Control_Type_2 {
    public static void main(String[] args) {
        Control.Type type1 = new Control.Type("Type1");
        Control.Type type2 = new Control.Type("Type2");

        System.out.println(type1.equals(type2)); // false
        System.out.println(type1.equals(type1)); // true
    }
}
