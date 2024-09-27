import javax.crypto.ExemptionMechanism;

public class ExemptionMechanism_1 {
    public static void main(String[] args) {
        ExemptionMechanism exMech = ExemptionMechanism.getInstance("exampleName");
        String name = exMech.getName();
        System.out.println("Exemption Mechanism Name: " + name);
    }
}
