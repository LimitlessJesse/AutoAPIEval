import java.awt.event.InvocationEvent;

public class InvocationEvent_1 {
    public static void main(String[] args) {
        InvocationEvent event = new InvocationEvent(new Object(), new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing run() method");
            }
        });
        event.dispatch();
    }
}
