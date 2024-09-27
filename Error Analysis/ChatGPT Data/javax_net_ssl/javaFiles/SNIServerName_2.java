import javax.net.ssl.SNIServerName;

public class SNIServerName_2 {
    public static void main(String[] args) {
        SNIServerName serverName = new SNIServerName((short) 0, new byte[]{0x01, 0x02, 0x03});
        byte[] encoded = serverName.getEncoded();
        for(byte b : encoded) {
            System.out.print(b + " ");
        }
    }
}
