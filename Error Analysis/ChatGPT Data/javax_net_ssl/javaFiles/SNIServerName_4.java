import javax.net.ssl.SNIServerName;

public class SNIServerName_4 {
    public static void main(String[] args) {
        SNIServerName sniServerName = new SNIServerName() {
            @Override
            public int getType() {
                return 0;
            }

            @Override
            public byte[] getEncoded() {
                return new byte[0];
            }

            @Override
            public int hashCode() {
                // Custom implementation of hashCode method
                return super.hashCode();
            }
        };

        // Calling the hashCode method
        int hashCode = sniServerName.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
