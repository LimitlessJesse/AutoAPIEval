import java.beans.Expression;

public class Expression_1 {
    public static void main(String[] args) {
        String text = "Hello World";
        Expression expression = new Expression(text, "substring", new Object[]{6});
        Object result = expression.getValue();
        System.out.println(result); // Output: World
    }
}
