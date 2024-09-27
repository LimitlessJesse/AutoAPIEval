import java.beans.Encoder;

public class Encoder_5 {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Object obj = new Object();
        
        Object result = encoder.get(obj);
        System.out.println(result);
    }
}
