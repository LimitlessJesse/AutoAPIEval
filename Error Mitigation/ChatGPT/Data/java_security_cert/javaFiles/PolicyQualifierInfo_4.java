import java.security.cert.PolicyQualifierInfo;

public class PolicyQualifierInfo_4 {
    public static void main(String[] args) {
        PolicyQualifierInfo policyQualifierInfo = new PolicyQualifierInfo(new byte[]{0x01, 0x02, 0x03});
        System.out.println(policyQualifierInfo.toString());
    }
}
