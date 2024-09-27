import java.beans.Expression;

public class Expression_3 {
    public static void main(String[] args) {
        Expression expression = new Expression(new Object(), "toString", new Object[0]);
        try {
            expression.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
