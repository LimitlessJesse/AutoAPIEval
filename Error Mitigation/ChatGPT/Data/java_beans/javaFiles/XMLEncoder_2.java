import java.beans.XMLEncoder;

public class XMLEncoder_2 {
    public static void main(String[] args) {
        XMLEncoder encoder = new XMLEncoder(System.out);
        Object owner = new Object();
        encoder.setOwner(owner);
        encoder.close();
    }
}
