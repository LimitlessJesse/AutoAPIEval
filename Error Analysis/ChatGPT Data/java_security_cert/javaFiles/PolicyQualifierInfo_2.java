import java.security.cert.PolicyQualifierInfo;

public class PolicyQualifierInfo_2 {
    public static void main(String[] args) {
        byte[] policyQualifier = new byte[10];
        PolicyQualifierInfo policyQualifierInfo = new PolicyQualifierInfo("test", policyQualifier);
        byte[] qualifier = policyQualifierInfo.getPolicyQualifier();
        System.out.println("Policy Qualifier: " + new String(qualifier));
    }
}
