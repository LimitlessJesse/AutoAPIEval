import java.beans.DefaultPersistenceDelegate;
import java.beans.Encoder;

public class DefaultPersistenceDelegate_5 {
    public static void main(String[] args) {
        DefaultPersistenceDelegate delegate = new DefaultPersistenceDelegate();
        Class<?> type = Object.class;
        Object oldInstance = "old";
        Object newInstance = "new";
        Encoder out = new Encoder();
        
        delegate.initialize(type, oldInstance, newInstance, out);
        
        System.out.println(out);
    }
}
