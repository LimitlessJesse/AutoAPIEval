import javax.xml.bind.Marshaller;

public class Marshaller_Listener_2 {
    public static void main(String[] args) {
        Marshaller.Listener marshallerListener = new Marshaller.Listener() {
            @Override
            public void afterMarshal(Object source) {
                System.out.println("After marshalling: " + source);
            }
        };

        // Example of invoking the afterMarshal method
        marshallerListener.afterMarshal("Example Object");
    }
}
