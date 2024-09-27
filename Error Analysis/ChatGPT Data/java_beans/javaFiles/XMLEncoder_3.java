import java.beans.XMLEncoder;

public class XMLEncoder_3 {
    public static void main(String[] args) {
        XMLEncoder encoder = new XMLEncoder(System.out);
        encoder.setOwner(new Object());
        encoder.close();
    }
}
