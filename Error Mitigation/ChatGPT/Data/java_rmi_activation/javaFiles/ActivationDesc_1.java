import java.rmi.activation.ActivationDesc;

public class ActivationDesc_1 {
    public static void main(String[] args) {
        ActivationDesc activationDesc = new ActivationDesc();
        String className = activationDesc.getClassName();
        System.out.println("Class Name: " + className);
    }
}
