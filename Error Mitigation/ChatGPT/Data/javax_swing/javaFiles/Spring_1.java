import javax.swing.Spring;

public class Spring_1 {
    public static void main(String[] args) {
        Spring spring = new Spring() {
            @Override
            public int getMinimumValue() {
                return 0; // Return the minimum value of this Spring
            }
        };
        
        System.out.println("Minimum value: " + spring.getMinimumValue());
    }
}
