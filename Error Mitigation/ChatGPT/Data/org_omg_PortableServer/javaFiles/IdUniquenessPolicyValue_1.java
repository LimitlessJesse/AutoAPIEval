import org.omg.PortableServer.IdUniquenessPolicyValue;

public class IdUniquenessPolicyValue_1 {
    public static void main(String[] args) {
        IdUniquenessPolicyValue policyValue = IdUniquenessPolicyValue.UNIQUE_ID;
        int value = policyValue.value();
        System.out.println("Value: " + value);
    }
}
