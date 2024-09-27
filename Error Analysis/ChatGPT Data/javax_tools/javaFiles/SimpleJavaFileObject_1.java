import javax.tools.SimpleJavaFileObject;

public class SimpleJavaFileObject_1 {
    public static void main(String[] args) {
        SimpleJavaFileObject fileObject = new SimpleJavaFileObject(java.net.URI.create("String"), SimpleJavaFileObject.Kind.SOURCE) {
            @Override
            public CharSequence getCharContent(boolean ignoreEncodingErrors) {
                return "public class HelloWorld {}";
            }
        };
        
        System.out.println(fileObject.getCharContent(false));
    }
}
