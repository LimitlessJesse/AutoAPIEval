import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Exchanger_5 {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        try {
            String value = exchanger.exchange("Value to exchange", 5, TimeUnit.SECONDS);
            System.out.println("Exchanged value: " + value);
        } catch (InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
