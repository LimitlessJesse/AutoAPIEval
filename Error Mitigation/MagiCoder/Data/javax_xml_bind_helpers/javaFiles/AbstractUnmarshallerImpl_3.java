import javax.xml.bind.helpers.AbstractUnmarshallerImpl;

public class AbstractUnmarshallerImpl_3 {
    public static void main(String[] args) {
        AbstractUnmarshallerImpl unmarshaller = new AbstractUnmarshallerImpl();

        unmarshaller.setListener(new Unmarshaller.Listener() {
            @Override
            public void beforeUnmarshal(Object target, Object parent) {
                System.out.println("Before unmarshal");
            }

            @Override
            public void afterUnmarshal(Object target, Object parent) {
                System.out.println("After unmarshal");
            }
        });
    }
}
