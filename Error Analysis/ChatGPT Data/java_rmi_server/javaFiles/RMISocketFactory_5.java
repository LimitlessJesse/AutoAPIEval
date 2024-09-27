import java.rmi.server.RMISocketFactory;

public class RMISocketFactory_5 {
    public static void main(String[] args) {
        RMISocketFactory fac = RMISocketFactory.getDefaultSocketFactory();
        // Set custom RMISocketFactory
        RMISocketFactory.setSocketFactory(fac);
    }
}
