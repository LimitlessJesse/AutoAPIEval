import java.lang.ref.Reference;

public class Reference_3 {
    public static void main(String[] args) {
        Reference<Object> reference = new Reference<>();
        boolean enqueued = reference.isEnqueued();
        System.out.println("Is Enqueued: " + enqueued);
    }
}
