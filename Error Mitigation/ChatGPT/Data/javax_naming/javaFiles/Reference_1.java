import javax.naming.RefAddr;
import javax.naming.Reference;

public class Reference_1 {
    public static void main(String[] args) {
        Reference reference = new Reference("Test");
        RefAddr addr = new RefAddr("Test Address");
        
        reference.add(0, addr);
    }
}
