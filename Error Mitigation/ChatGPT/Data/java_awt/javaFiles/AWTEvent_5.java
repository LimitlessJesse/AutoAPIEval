import java.awt.AWTEvent;

public class AWTEvent_5 {
    public static void main(String[] args) {
        AWTEvent event = new AWTEvent(new Object(), 0) {
            // Override paramString method
            public String paramString() {
                return "AWTEvent parameters";
            }
        };
        
        System.out.println(event.paramString());
    }
}
