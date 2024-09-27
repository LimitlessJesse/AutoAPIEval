import java.beans.PersistenceDelegate;
import java.beans.Encoder;
import java.util.ArrayList;

public class Encoder_2 {
    public static void main(String[] args) {
        PersistenceDelegate pd = Encoder.getPersistenceDelegate(ArrayList.class);
        System.out.println("PersistenceDelegate for ArrayList: " + pd);
    }
}
