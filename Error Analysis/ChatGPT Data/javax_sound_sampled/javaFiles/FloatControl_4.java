import javax.sound.sampled.FloatControl;

public class FloatControl_4 {
    public static void main(String[] args) {
        FloatControl floatControl = new FloatControl() {
            @Override
            public float getPrecision() {
                return 0.1f;
            }

            // Other abstract methods implementation...
        };
        
        System.out.println("Float precision: " + floatControl.getPrecision());
    }
}
