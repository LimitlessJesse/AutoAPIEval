import java.rmi.Naming;

public class Naming_4 {
    public static void main(String[] args) {
        try {
            Naming.unbind("rmi://localhost/CalculatorService");
            System.out.println("Unbind successful");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
