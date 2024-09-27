import javax.crypto.spec.DESedeKeySpec;

public class DESedeKeySpec_1 {
    public static void main(String[] args) {
        byte[] keyBytes = {0x01, 0x23, 0x45, 0x67, (byte)0x89, (byte)0xab, (byte)0xcd, (byte)0xef, 0x10, 0x32, 0x54, 0x76, (byte)0x98, (byte)0xba, (byte)0xdc, (byte)0xfe};
        
        DESedeKeySpec desKeySpec = new DESedeKeySpec(keyBytes);
        byte[] desKey = desKeySpec.getKey();
        
        System.out.println("DES-EDE Key: " + bytesToHex(desKey));
    }
    
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
