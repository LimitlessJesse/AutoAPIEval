import java.beans.Encoder;
import java.beans.Expression;

public class Encoder_4 {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Expression expression = new Expression("exampleValue");
        encoder.writeExpression(expression);
    }
}
