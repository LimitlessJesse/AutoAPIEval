import javax.sound.sampled.EnumControl;

public class EnumControl_3 {
    public static void main(String[] args) {
        EnumControl enumControl = new EnumControl();
        Object value = "desiredValue";
        
        try {
            enumControl.setValue(value);
            System.out.println("Value set successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
