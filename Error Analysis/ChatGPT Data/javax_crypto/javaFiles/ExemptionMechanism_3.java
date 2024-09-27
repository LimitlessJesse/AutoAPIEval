import javax.crypto.ExemptionMechanism;

public class ExemptionMechanism_3 {
    public static void main(String[] args) {
        ExemptionMechanism ex = ExemptionMechanism.getInstance("Test");
        String name = ex.getName();
        System.out.println("Exemption mechanism name: " + name);
    }
}
