import java.beans.Expression;
import java.beans.XMLEncoder;

public class XMLEncoder_3 {
    public static void main(String[] args) {
        XMLEncoder encoder = new XMLEncoder(System.out);
        
        // Creating an Expression object
        Expression expression = new Expression(new XMLEncoder_3(), "toString", null);
        
        // Writing the Expression using writeExpression method
        encoder.writeExpression(expression);
        
        // Flushing the stream to generate the output
        encoder.flush();
        encoder.close();
    }
}
