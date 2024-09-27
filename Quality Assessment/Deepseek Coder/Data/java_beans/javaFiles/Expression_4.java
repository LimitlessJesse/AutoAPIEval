import java.beans.Expression;
import java.beans.SimpleBeanInfo;

public class Expression_4 {
    public static void main(String[] args) {
        SimpleBeanInfo beanInfo = new SimpleBeanInfo() {
            @Override
            public Expression[] getExpression() {
                return new Expression[] {
                    new Expression("value", this.ID_VALUE, null)
                };
            }
        };

        Expression expression = beanInfo.getExpression()[0];
        expression.setValue(new String("Hello World"));
        System.out.println(expression.getValue());
    }
}
