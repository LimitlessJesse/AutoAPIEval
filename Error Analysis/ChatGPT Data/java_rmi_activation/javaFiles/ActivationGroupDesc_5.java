import java.rmi.activation.ActivationGroupDesc;

public class ActivationGroupDesc_5 {
    public static void main(String[] args) {
        ActivationGroupDesc desc = new ActivationGroupDesc();
        String location = desc.getLocation();
        System.out.println("Location: " + location);
    }
}
