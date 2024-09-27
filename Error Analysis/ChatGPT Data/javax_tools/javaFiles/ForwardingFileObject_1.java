import javax.tools.ForwardingFileObject;

public class ForwardingFileObject_1 {
    public static void main(String[] args) {
        ForwardingFileObject fileObject = new ForwardingFileObject() {
            @Override
            public CharSequence getCharContent(boolean ignoreEncodingErrors) {
                // Add your implementation here
                return null;
            }
        };
    }
}
