import org.omg.PortableServer.IdAssignmentPolicyValue;

public class IdAssignmentPolicyValue_1 {
    public static void main(String[] args) {
        IdAssignmentPolicyValue policyValue = IdAssignmentPolicyValue.IMPLICIT_ID;
        int value = policyValue.value();
        System.out.println("Policy value: " + value);
    }
}
