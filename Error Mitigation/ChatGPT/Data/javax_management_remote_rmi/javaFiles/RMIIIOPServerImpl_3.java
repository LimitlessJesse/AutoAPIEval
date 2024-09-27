import javax.management.remote.rmi.RMIIIOPServerImpl;

public class RMIIIOPServerImpl_3 {
    public static void main(String[] args) {
        RMIIIOPServerImpl server = new RMIIIOPServerImpl();
        String protocol = server.getProtocol();
        System.out.println("Protocol: " + protocol);
    }
}
