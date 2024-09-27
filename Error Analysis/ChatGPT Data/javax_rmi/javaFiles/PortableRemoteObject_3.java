import javax.rmi.PortableRemoteObject;
import java.rmi.Remote;

public class PortableRemoteObject_3 {
    public static void main(String[] args) {
        // Assuming you have a Remote object named remoteObj
        Remote stub = PortableRemoteObject.toStub(remoteObj);
    }
}
