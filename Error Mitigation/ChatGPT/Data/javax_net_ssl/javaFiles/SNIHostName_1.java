import javax.net.ssl.SNIHostName;

public class SNIHostName_1 {
    public static void main(String[] args) {
        SNIHostName sniHostName = new SNIHostName("example.com");
        String asciiName = sniHostName.getAsciiName();
        System.out.println("ASCII Name: " + asciiName);
    }
}
