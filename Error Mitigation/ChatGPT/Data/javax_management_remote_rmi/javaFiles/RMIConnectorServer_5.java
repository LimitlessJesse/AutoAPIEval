import javax.management.remote.rmi.RMIConnectorServer;

public class RMIConnectorServer_5 {
    public static void main(String[] args) {
        RMIConnectorServer connectorServer = new RMIConnectorServer();
        MBeanServerForwarder mbsf = new MBeanServerForwarder();
        connectorServer.setMBeanServerForwarder(mbsf);
    }
}
