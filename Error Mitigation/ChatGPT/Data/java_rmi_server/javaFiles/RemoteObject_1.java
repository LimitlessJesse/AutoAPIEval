import java.rmi.server.RemoteObject;
import java.rmi.server.RemoteRef;

public class RemoteObject_1 {
    public static void main(String[] args) {
        RemoteObject remoteObject = new RemoteObject();
        RemoteRef remoteRef = remoteObject.getRef();
        System.out.println(remoteRef);
    }
}
