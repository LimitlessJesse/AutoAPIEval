import java.beans.Encoder;
import java.beans.PersistenceDelegate;

public class Encoder_1 {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        PersistenceDelegate delegate = new PersistenceDelegate();
        
        encoder.setPersistenceDelegate(MyClass.class, delegate);
    }
}

class MyClass {
    // Class definition
}
