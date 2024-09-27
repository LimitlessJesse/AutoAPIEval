import javax.net.ssl.SNIServerName;

public class SNIServerName_3 {
    public static void main(String[] args) {
        SNIServerName serverName = new SNIServerName() {
            @Override
            public String toString() {
                return "type=(31), value=77:77:77:2E:65:78:61:6D:70:6C:65:2E:63:6E";
            }
        };
        
        System.out.println(serverName.toString());
    }
}
