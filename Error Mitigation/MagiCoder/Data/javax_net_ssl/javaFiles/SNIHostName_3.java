import javax.net.ssl.SNIHostName;

public class SNIHostName_3 {
    public static void main(String[] args) {
        SNIHostName hostName1 = new SNIHostName("example.com");
        SNIHostName hostName2 = new SNIHostName("example.com");
        SNIHostName hostName3 = new SNIHostName("example.org");

        System.out.println(hostName1.equals(hostName2)); // true
        System.out.println(hostName1.equals(hostName3)); // false
    }
}
