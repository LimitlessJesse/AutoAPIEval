import javax.net.ssl.SNIHostName;

public class SNIHostName_1 {
    public static void main(String[] args) {
        SNIHostName hostName = new SNIHostName("www.example.com");
        System.out.println("ASCII Name: " + hostName.getAsciiName());
    }
}
