import java.rmi.activation.ActivationGroupDesc;

public class ActivationGroupDesc_3 {
    public static void main(String[] args) {
        ActivationGroupDesc desc = new ActivationGroupDesc();
        String className = desc.getClassName();
        System.out.println("Activation Group Class Name: " + className);
    }
}
