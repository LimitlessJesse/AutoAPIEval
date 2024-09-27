import org.omg.PortableServer.IdAssignmentPolicyValue;
import org.omg.PortableServer.IdAssignmentPolicy;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.ServantRetentionPolicyValue;

public class IdAssignmentPolicyValue_1 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        IdAssignmentPolicy idAssignmentPolicy = orb.create_policy(IdAssignmentPolicy.IDASSIGNMENTPOLICY_ID, "");
        IdAssignmentPolicyValue idAssignmentPolicyValue = IdAssignmentPolicyValue.class.cast(idAssignmentPolicy.value());
        ServantRetentionPolicyValue servantRetentionPolicyValue = idAssignmentPolicyValue.value();
        System.out.println(servantRetentionPolicyValue);
    }
}
