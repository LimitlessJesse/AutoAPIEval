import java.awt.Insets;

public class Insets_5 {
    public static void main(String[] args) {
        Insets insets1 = new Insets(10, 20, 10, 20);
        Insets insets2 = new Insets(10, 20, 10, 20);
        
        boolean areEqual = insets1.equals(insets2);
        System.out.println("Are the Insets objects equal? " + areEqual);
    }
}
