import org.omg.PortableServer.POAPackage.ObjectNotActiveHelper;

import java.io.OutputStream;

public class ObjectNotActiveHelper_3 {
    public static void main(String[] args) {
        OutputStream outputStream = System.out;
        ObjectNotActive objectNotActive = new ObjectNotActive();
        
        ObjectNotActiveHelper.write(outputStream, objectNotActive);
    }
}
