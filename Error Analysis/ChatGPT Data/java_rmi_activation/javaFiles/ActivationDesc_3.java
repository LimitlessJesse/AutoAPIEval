import java.rmi.activation.ActivationDesc;

public class ActivationDesc_3 {
    public static void main(String[] args) {
        ActivationDesc activationDesc = new ActivationDesc("example", "example", null, null);
        String className = activationDesc.getClassName();
        System.out.println("Class Name: " + className);
    }
}
