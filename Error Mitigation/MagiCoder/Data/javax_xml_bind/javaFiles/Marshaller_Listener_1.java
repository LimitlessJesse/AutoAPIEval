import javax.xml.bind.Marshaller;
import javax.xml.bind.Marshaller.Listener;
import java.util.ArrayList;
import java.util.List;

public class Marshaller_Listener_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        MyListener listener = new MyListener();
        Marshaller marshaller = new Marshaller();
        marshaller.setListener(listener);

        for (String s : list) {
            marshaller.marshal(s, System.out);
        }
    }
}

class MyListener implements Listener {
    @Override
    public void beforeMarshal(Object source) {
        System.out.println("Before marshalling: " + source);
    }
}
