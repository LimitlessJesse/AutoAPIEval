import javax.net.ssl.SNIHostName;

public class SNIHostName_5 {
    public static void main(String[] args) {
        SNIHostName hostName = new SNIHostName("www.example.com");
        System.out.println(hostName.toString());
    }
}
