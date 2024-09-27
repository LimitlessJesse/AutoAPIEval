import javax.tools.SimpleJavaFileObject;

public class SimpleJavaFileObject_3 {
    public static void main(String[] args) {
        SimpleJavaFileObject fileObject = new SimpleJavaFileObject("Test.java", SimpleJavaFileObject.Kind.SOURCE);
        String name = fileObject.getName();
        System.out.println("Name: " + name);
    }
}
