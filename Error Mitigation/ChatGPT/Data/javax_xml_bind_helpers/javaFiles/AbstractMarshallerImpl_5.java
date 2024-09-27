import javax.xml.bind.Marshaller;
import javax.xml.bind.helpers.AbstractMarshallerImpl;

public class AbstractMarshallerImpl_5 {
    public static void main(String[] args) {
        AbstractMarshallerImpl marshaller = new AbstractMarshallerImpl() {
            @Override
            public void setListener(Marshaller.Listener listener) {
                // Register marshal event callback Marshaller.Listener with this Marshaller
                // There is only one Listener per Marshaller. Setting a Listener replaces the previous set Listener.
                // One can unregister current Listener by setting listener to null.
            }
        };
    }
}
