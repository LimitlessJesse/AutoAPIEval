import java.beans.Expression;

public class Expression_2 {
    public static void main(String[] args) {
        Expression expression = new Expression(new Object(), "setValue", new Object[]{10});
        try {
            expression.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
