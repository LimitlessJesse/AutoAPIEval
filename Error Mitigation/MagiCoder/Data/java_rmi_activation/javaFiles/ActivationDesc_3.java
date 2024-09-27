import java.rmi.activation.ActivationDesc;

public class ActivationDesc_3 {
    public static void main(String[] args) {
        ActivationDesc desc = new ActivationDesc(null, "java.lang.String", null, null, null, null);
        String className = desc.getClassName();
        System.out.println(className);
    }
}
