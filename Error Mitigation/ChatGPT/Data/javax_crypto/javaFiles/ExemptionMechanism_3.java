import javax.crypto.ExemptionMechanism;

public class ExemptionMechanism_3 {
    public static void main(String[] args) {
        ExemptionMechanism exemptionMechanism = ExemptionMechanism.getInstance("exampleAlgorithm");
        int inputLen = 10;
        try {
            int outputSize = exemptionMechanism.getOutputSize(inputLen);
            System.out.println("Required output buffer size: " + outputSize + " bytes");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
