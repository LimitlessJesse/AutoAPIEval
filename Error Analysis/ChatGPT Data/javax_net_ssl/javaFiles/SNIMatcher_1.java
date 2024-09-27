import javax.net.ssl.SNIMatcher;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SNIHostName;

public class SNIMatcher_1 {
    public static void main(String[] args) {
        SNIMatcher matcher = new SNIMatcher(0) {
            @Override
            public boolean matches(SNIServerName serverName) {
                if (serverName.getType() == SNIHostName.TYPE) {
                    SNIHostName hostName = (SNIHostName) serverName;
                    String hostname = hostName.getAsciiName();
                    return "example.com".equalsIgnoreCase(hostname);
                }
                return false;
            }
        };

        // Example usage
        SNIServerName serverName = new SNIHostName("example.com");
        boolean result = matcher.matches(serverName);
        System.out.println("Match result: " + result);
    }
}
