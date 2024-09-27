import org.omg.PortableInterceptor.ServerIdHelper;

public class ServerIdHelper_3 {
    public static void main(String[] args) {
        String serverId = ServerIdHelper.id();
        System.out.println("Server ID: " + serverId);
    }
}
