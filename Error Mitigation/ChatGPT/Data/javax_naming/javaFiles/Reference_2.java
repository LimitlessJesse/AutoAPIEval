import javax.naming.RefAddr;
import javax.naming.Reference;

public class Reference_2 {
    public static void main(String[] args) {
        Reference reference = new Reference("Test");
        RefAddr refAddr = new RefAddr("TestType", "TestContent");
        reference.add(refAddr);

        RefAddr retrievedAddr = reference.get(0);
        System.out.println("Retrieved Address: " + retrievedAddr);
    }
}
