import java.lang.invoke.SerializedLambda;

public class SerializedLambda_2 {
    public static void main(String[] args) {
        SerializedLambda lambda = new SerializedLambda();
        String signature = lambda.getImplMethodSignature();
        System.out.println("Implementation method signature: " + signature);
    }
}
