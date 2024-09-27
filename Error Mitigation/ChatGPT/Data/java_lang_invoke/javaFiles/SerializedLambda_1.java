import java.lang.invoke.SerializedLambda;

public class SerializedLambda_1 {
    public static void main(String[] args) {
        SerializedLambda lambda = new SerializedLambda();
        String methodName = lambda.getImplMethodName();
        System.out.println("Implementation method name: " + methodName);
    }
}
