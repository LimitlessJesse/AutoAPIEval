import java.io.OutputStream;
import java.rmi.server.RemoteServer;

public class RemoteServer_4 {
    public static void main(String[] args) {
        RemoteServer remoteServer = new RemoteServer() {
            @Override
            public void setLog(OutputStream out) {
                // Implement custom log setting here
            }
        };
    }
}
