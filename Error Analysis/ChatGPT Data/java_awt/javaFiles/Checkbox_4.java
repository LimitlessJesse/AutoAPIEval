import java.awt.Checkbox;

public class Checkbox_4 {
    public static void main(String[] args) {
        Checkbox checkbox = new Checkbox("Enable");
        boolean state = checkbox.getState();
        System.out.println("Checkbox state: " + state);
    }
}
