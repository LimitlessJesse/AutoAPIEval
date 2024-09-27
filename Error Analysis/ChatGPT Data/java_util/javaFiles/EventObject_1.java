import java.util.EventObject;

public class CustomEventObject extends EventObject {
    
    public CustomEventObject(Object source) {
        super(source);
    }

    public Object getSource() {
        return super.getSource();
    }

    public static void main(String[] args) {
        CustomEventObject event = new CustomEventObject("Event source");
        System.out.println("Event source: " + event.getSource());
    }
}
