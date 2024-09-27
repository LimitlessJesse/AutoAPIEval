import java.lang.invoke.SerializedLambda;

public class SerializedLambda_4 {
    public static void main(String[] args) {
        SerializedLambda lambda = new SerializedLambda();
        Object capturedArg = lambda.getCapturedArg(0);
        System.out.println("Captured argument at index 0: " + capturedArg);
    }
}
