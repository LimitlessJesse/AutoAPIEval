import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Unmarshaller.Listener;

public class Unmarshaller_Listener_1 {
    public static void main(String[] args) {
        Unmarshaller unmarshaller =...; // get your unmarshaller
        unmarshaller.setListener(new Listener() {
            @Override
            public void beforeUnmarshal(Object target, Object parent) {
                // your code here
            }
        });
    }
}
