import java.rmi.activation.ActivationDesc;
import java.rmi.activation.ActivationException;
import java.rmi.activation.ActivationID;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;

public class ActivationDesc_2 {
    public static void main(String[] args) {
        try {
            Remote remoteObject = UnicastRemoteObject.exportObject(new MyRemoteObject(), 0);
            ActivationDesc desc = new ActivationDesc(ActivationID.getNextID(), remoteObject.getClass().getClassName(), null);
            System.out.println(desc.getClassName());
        } catch (ActivationException e) {
            e.printStackTrace();
        }
    }
}

class MyRemoteObject implements Remote {
    // Implementation of the remote object
}
