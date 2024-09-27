import javax.xml.bind.Unmarshaller;

public class Unmarshaller_Listener_2 {
    public static void main(String[] args) {
        Unmarshaller.Listener listener = new Unmarshaller.Listener() {
            @Override
            public void afterUnmarshal(Object target, Object parent) {
                // Callback logic after unmarshalling
                System.out.println("After unmarshalling: " + target.toString());
            }
        };
    }
}
