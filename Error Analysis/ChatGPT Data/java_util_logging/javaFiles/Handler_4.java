import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;

public class Handler_4 {
    public static void main(String[] args) {
        Handler handler = new ConsoleHandler();
        String encoding = handler.getEncoding();
        System.out.println("Handler encoding: " + encoding);
    }
}
