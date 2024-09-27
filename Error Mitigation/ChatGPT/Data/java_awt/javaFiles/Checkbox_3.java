import java.awt.Checkbox;

public class Checkbox_3 {
    public static void main(String[] args) {
        Checkbox checkbox = new Checkbox("Example Checkbox");
        String label = checkbox.getLabel();
        System.out.println("Label of the checkbox: " + label);
    }
}
