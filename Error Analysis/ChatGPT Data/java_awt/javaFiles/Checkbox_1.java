import java.awt.Checkbox;

public class Checkbox_1 {
    public static void main(String[] args) {
        Checkbox checkbox = new Checkbox("Check Me");
        System.out.println("Before setting label: " + checkbox.getLabel());
        
        checkbox.setLabel("New Label");
        System.out.println("After setting label: " + checkbox.getLabel());
    }
}
