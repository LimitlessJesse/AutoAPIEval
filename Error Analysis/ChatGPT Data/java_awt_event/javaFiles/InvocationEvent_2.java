import java.awt.event.InvocationEvent;

public class InvocationEvent_2 {
    public static void main(String[] args) {
        InvocationEvent event = new InvocationEvent(new Object(), () -> {
            System.out.println("Invocation Event");
        });
        
        boolean dispatched = event.isDispatched();
        System.out.println("Is Event Dispatched: " + dispatched);
    }
}
