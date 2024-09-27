import javax.sound.sampled.FloatControl;

public class FloatControl_1 {
    public static void main(String[] args) {
        FloatControl floatControl = new FloatControl() {
            @Override
            public float getMinimum() {
                return 0.0f; // Example minimum value
            }
        };
        
        float minimumValue = floatControl.getMinimum();
        System.out.println("Minimum value: " + minimumValue);
    }
}
