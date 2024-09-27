import java.beans.XMLEncoder;
import java.beans.Expression;

public class XMLEncoder_4 {
    public static void main(String[] args) {
        XMLEncoder encoder = new XMLEncoder(System.out);
        Expression expression = new Expression("1 + 2", Integer.class);
        encoder.writeExpression(expression);
        encoder.close();
    }
}
