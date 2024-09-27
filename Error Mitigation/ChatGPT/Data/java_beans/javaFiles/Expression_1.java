import java.beans.Expression;

public class Expression_1 {
    public static void main(String[] args) {
        // Create an Expression object
        Expression expression = new Expression(new Object(), "toString", new Object[0]);
        
        try {
            // Get the value using the getValue() method
            Object result = expression.getValue();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
