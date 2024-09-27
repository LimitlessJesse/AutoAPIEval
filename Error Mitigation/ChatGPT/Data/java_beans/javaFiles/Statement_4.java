import java.beans.Statement;

public class Statement_4 {
    public static void main(String[] args) {
        Object target = new Object();
        Statement statement = new Statement(target, "toString", null);
        
        Object statementTarget = statement.getTarget();
        System.out.println("Target object of the statement: " + statementTarget);
    }
}
