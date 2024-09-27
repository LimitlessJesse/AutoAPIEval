import javax.print.attribute.standard.NumberUp;

public class NumberUp_5 {
    public static void main(String[] args) {
        // Create two NumberUp objects
        NumberUp num1 = new NumberUp(2);
        NumberUp num2 = new NumberUp(2);

        // Check if the two NumberUp objects are equal
        boolean result = num1.equals(num2);
        System.out.println("Are the NumberUp objects equal? " + result);
    }
}
