import javax.xml.bind.Marshaller;
import javax.xml.bind.Marshaller.Listener;

public class Marshaller_Listener_2 {
    public static void main(String[] args) {
        Marshaller marshaller = new Marshaller();
        
        marshaller.setListener(new Listener() {
            @Override
            public void afterMarshal(Object source) {
                // Your implementation here
            }
        });
    }
}
