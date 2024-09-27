import javax.print.attribute.standard.Fidelity;

public class Fidelity_3 {
    public static void main(String[] args) {
        Fidelity fidelity = new Fidelity(Fidelity.FIDELITY_FALSE);
        System.out.println("Fidelity name: " + fidelity.getName());
    }
}
