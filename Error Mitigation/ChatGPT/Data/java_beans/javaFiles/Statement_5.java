import java.beans.Statement;

public class Statement_5 {
    public static void main(String[] args) {
        Statement statement = new Statement(new Object(), "methodName", new Object[]{"arg1", "arg2"});
        Object[] arguments = statement.getArguments();
        
        for (Object arg : arguments) {
            System.out.println(arg);
        }
    }
}
