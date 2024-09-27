import javax.naming.Reference;

public class Reference_1 {
    public static void main(String[] args) {
        Reference ref = new Reference("Test");
        System.out.println(ref.getClassName());
    }
}
