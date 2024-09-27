import java.rmi.activation.ActivationException;
import java.rmi.activation.ActivationID;
import java.rmi.activation.ActivationGroup;
import java.rmi.activation.UnknownObjectException;
import java.rmi.RemoteException;
import java.rmi.MarshalledObject;
import java.rmi.Remote;

public class ActivationGroup_5 {
    public static void main(String[] args) {
        ActivationGroup activationGroup = new ActivationGroup();
        ActivationID id = new ActivationID();
        MarshalledObject<? extends Remote> mobj = new MarshalledObject<>();
        
        try {
            activationGroup.activeObject(id, mobj);
        } catch (ActivationException | UnknownObjectException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
