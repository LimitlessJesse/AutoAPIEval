import java.beans.Statement;

public class Statement_3 {
    public static void main(String[] args) {
        Statement statement = new Statement("a", "setFoo", new Object[] {"b"});
        String methodName = statement.getMethodName();
        System.out.println("Method Name: " + methodName);
    }
}
