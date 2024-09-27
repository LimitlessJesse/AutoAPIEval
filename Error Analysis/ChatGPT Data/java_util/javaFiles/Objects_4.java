import java.util.Objects;

public class Objects_4 {
    public static void main(String[] args) {
        Object obj = new Object();
        String objString = Objects.toString(obj);
        System.out.println(objString);
    }
}
