import java.rmi.activation.ActivationDesc;

public class ActivationDesc_2 {
    public static void main(String[] args) {
        ActivationDesc activationDesc = new ActivationDesc();
        String codeLocation = activationDesc.getLocation();
        System.out.println("Code location: " + codeLocation);
    }
}
