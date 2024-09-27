import javax.xml.bind.Unmarshaller;

public class Unmarshaller_Listener_1 {
    public static void main(String[] args) {
        Unmarshaller.Listener listener = new Unmarshaller.Listener() {
            @Override
            public void beforeUnmarshal(Object target, Object parent) {
                // Callback method implementation
                System.out.println("Before unmarshalling: " + target.toString());
            }
        };
    }
}
