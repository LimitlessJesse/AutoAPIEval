import java.beans.PropertyChangeEvent;

public class PropertyChangeEvent_5 {
    public static void main(String[] args) {
        PropertyChangeEvent event = new PropertyChangeEvent(new Object(), "propName", null, "propValue");
        event.setPropagationId("propagationId");
        System.out.println("Propagation Id: " + event.getPropagationId());
    }
}
