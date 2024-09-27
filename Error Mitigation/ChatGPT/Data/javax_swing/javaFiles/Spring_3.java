import javax.swing.Spring;

public class Spring_3 {
    public static void main(String[] args) {
        Spring spring = new Spring() {
            @Override
            public int getMaximumValue() {
                return 100; // Example value, replace with actual implementation
            }
        };
        
        System.out.println("Maximum value: " + spring.getMaximumValue());
    }
}
