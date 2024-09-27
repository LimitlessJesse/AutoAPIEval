import java.util.logging.Handler;

public class Handler_2 {
    public static void main(String[] args) {
        // Assuming we have a custom Handler implementation
        MyCustomHandler customHandler = new MyCustomHandler();
        customHandler.flush();
    }
}

class MyCustomHandler extends Handler {
    @Override
    public void flush() {
        // Implement custom flushing logic here
        System.out.println("Flushing logs...");
    }
}
