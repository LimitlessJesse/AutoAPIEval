import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Binder;

public class JAXBContext_4 {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Node.class);
            Binder<Node> binder = jaxbContext.createBinder();

            Node node = new Node();
            node.setName("Example");

            binder.marshal(node, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

class Node {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
