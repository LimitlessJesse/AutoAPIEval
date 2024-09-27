import java.rmi.activation.ActivationID;
import java.rmi.activation.ActivationException;
import java.rmi.activation.UnknownObjectException;
import java.rmi.RemoteException;

public class Activatable_2 {
    public static void main(String[] args) {
        ActivationID id = new ActivationID(); // Create an ActivationID object
        
        try {
            Activatable.unregister(id); // Call the unregister method with the ActivationID object
        } catch (UnknownObjectException e) {
            e.printStackTrace();
        } catch (ActivationException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }
}
