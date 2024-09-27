import java.security.cert.PolicyQualifierInfo;

public class PolicyQualifierInfo_2 {
    public static void main(String[] args) {
        PolicyQualifierInfo policyQualifierInfo = new PolicyQualifierInfo(new byte[]{0x01, 0x02, 0x03});
        byte[] qualifier = policyQualifierInfo.getPolicyQualifier();
        System.out.println("Qualifier: " + bytesToHex(qualifier));
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            hexString.append(String.format("%02X", b));
        }
        return hexString.toString();
    }
}
