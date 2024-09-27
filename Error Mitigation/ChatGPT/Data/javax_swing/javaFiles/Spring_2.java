import javax.swing.Spring;

public class Spring_2 {
    public static void main(String[] args) {
        Spring spring = new Spring() {
            @Override
            public int getPreferredValue() {
                return 10; // Example preferred value
            }
        };
        
        System.out.println("Preferred value: " + spring.getPreferredValue());
    }
}
