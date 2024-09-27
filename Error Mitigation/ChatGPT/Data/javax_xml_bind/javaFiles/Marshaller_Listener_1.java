import javax.xml.bind.Marshaller;

public class Marshaller_Listener_1 {
    public static void main(String[] args) {
        Marshaller.Listener listener = new Marshaller.Listener() {
            @Override
            public void beforeMarshal(Object source) {
                // Callback method implementation
                System.out.println("Before marshalling: " + source.toString());
            }
        };
        
        // Example usage
        Object data = "Sample data";
        listener.beforeMarshal(data);
    }
}
