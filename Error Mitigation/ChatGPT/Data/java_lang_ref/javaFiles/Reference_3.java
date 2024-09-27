import java.lang.ref.Reference;

public class Reference_3 {
    public static void main(String[] args) {
        Reference<Object> reference = new Reference<>(new Object());
        reference.clear();
    }
}
