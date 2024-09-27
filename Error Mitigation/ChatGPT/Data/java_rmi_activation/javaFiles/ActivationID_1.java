import java.rmi.activation.ActivationException;
import java.rmi.activation.ActivationID;
import java.rmi.activation.UnknownObjectException;
import java.rmi.RemoteException;

public class ActivationID_1 {
    public static void main(String[] args) {
        ActivationID activationID = new ActivationID();
        try {
            Remote remoteObject = activationID.activate(true);
            // Use the active remote object
        } catch (ActivationException | UnknownObjectException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
