import javax.tools.ForwardingFileObject;
import javax.tools.FileObject;

public class ForwardingFileObject_3 {
    public static void main(String[] args) {
        FileObject fileObject = new ForwardingFileObject() {
            @Override
            public String getName() {
                return "example.java";
            }
        };

        String name = fileObject.getName();
        System.out.println(name);
    }
}
