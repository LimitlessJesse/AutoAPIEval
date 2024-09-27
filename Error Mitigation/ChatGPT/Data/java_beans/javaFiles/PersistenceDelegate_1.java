import java.beans.Encoder;
import java.beans.PersistenceDelegate;

public class PersistenceDelegate_1 {
    public static void main(String[] args) {
        PersistenceDelegate persistenceDelegate = new PersistenceDelegate();

        // Create an instance to be written
        Object oldInstance = new Object();

        // Create an Encoder stream
        Encoder out = new Encoder();

        // Call the writeObject method to write the instance to the stream
        persistenceDelegate.writeObject(oldInstance, out);
    }
}
