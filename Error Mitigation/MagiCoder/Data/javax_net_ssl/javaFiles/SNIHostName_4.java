import javax.net.ssl.SNIHostName;

public class SNIHostName_4 {
    public static void main(String[] args) {
        SNIHostName hostName = new SNIHostName("example.com");
        int hashCode = hostName.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
