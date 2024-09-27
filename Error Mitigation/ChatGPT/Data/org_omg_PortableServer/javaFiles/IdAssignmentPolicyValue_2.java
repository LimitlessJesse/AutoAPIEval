import org.omg.PortableServer.IdAssignmentPolicyValue;

public class IdAssignmentPolicyValue_2 {
    public static void main(String[] args) {
        int value = 1; // Example value
        IdAssignmentPolicyValue idAssignmentPolicyValue = IdAssignmentPolicyValue.from_int(value);
        System.out.println("IdAssignmentPolicyValue: " + idAssignmentPolicyValue);
    }
}
