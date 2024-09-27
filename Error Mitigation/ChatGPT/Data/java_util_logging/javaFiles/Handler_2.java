import java.util.logging.Handler;

public class Handler_2 {
    public static void main(String[] args) {
        Handler handler = new Handler() {
            @Override
            public void flush() {
                // Implementation of the flush method
                System.out.println("Flush any buffered output");
            }
        };
        
        handler.flush();
    }
}
