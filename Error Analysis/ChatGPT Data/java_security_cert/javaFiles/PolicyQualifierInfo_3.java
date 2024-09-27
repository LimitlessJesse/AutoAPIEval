import java.security.cert.PolicyQualifierInfo;

public class PolicyQualifierInfo_3 {
    public static void main(String[] args) {
        PolicyQualifierInfo policyQualifierInfo = new PolicyQualifierInfo(new byte[]{0, 1, 2});
        String policyQualifierInfoString = policyQualifierInfo.toString();
        System.out.println(policyQualifierInfoString);
    }
}
