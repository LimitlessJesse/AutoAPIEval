import javax.rmi.PortableRemoteObject;

public class PortableRemoteObject_1 {
    public static void main(String[] args) {
        Object remoteObject = new Object();
        Class<?> narrowClass = String.class;
        Object narrowedObject = PortableRemoteObject.narrow(remoteObject, narrowClass);
        
        System.out.println("Narrowed Object: " + narrowedObject);
    }
}
