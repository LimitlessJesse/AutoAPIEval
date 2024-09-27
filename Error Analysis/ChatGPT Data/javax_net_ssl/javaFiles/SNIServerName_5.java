import javax.net.ssl.SNIServerName;

public class SNIServerName_5 {
    public static void main(String[] args) {
        SNIServerName serverName1 = new SNIServerName() {
            @Override
            public int getType() {
                return 0;
            }

            @Override
            public byte[] getEncoded() {
                return new byte[0];
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SNIServerName)) {
                    return false;
                }
                // perform custom equals comparison logic here
                return true;
            }
        };

        SNIServerName serverName2 = new SNIServerName() {
            @Override
            public int getType() {
                return 0;
            }

            @Override
            public byte[] getEncoded() {
                return new byte[0];
            }
        };

        System.out.println(serverName1.equals(serverName2));
    }
}
