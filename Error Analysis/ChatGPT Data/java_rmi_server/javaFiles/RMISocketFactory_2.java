import java.rmi.server.RMISocketFactory;
import java.net.ServerSocket;

public class RMISocketFactory_2 {
    public static void main(String[] args) {
        try {
            RMISocketFactory.setSocketFactory(new RMISocketFactory() {
                public ServerSocket createServerSocket(int port) {
                    return new ServerSocket(port);
                }
            });

            // Using the custom ServerSocket created with RMISocketFactory
            ServerSocket serverSocket = RMISocketFactory.getSocketFactory().createServerSocket(1234);
            System.out.println("ServerSocket created on port 1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
