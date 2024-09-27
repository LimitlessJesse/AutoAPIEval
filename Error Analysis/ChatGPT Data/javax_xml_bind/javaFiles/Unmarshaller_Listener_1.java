import javax.xml.bind.Unmarshaller.Listener;

public class MyListener extends Listener {
    @Override
    public void beforeUnmarshal(Object target, Object parent) {
        // Custom logic before unmarshalling
        System.out.println("Before Unmarshalling...");
    }
}

public class Unmarshaller_Listener_1 {
    public static void main(String[] args) {
        // Create an instance of MyListener
        MyListener customListener = new MyListener();

        // Use the beforeUnmarshal method
        customListener.beforeUnmarshal(new Object(), new Object());
    }
}
