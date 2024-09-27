import java.text.Annotation;

public class Annotation_3 {
    public static void main(String[] args) {
        Annotation annotation = new Annotation("example");
        Object value = annotation.getValue();
        System.out.println("Annotation value: " + value);
    }
}
