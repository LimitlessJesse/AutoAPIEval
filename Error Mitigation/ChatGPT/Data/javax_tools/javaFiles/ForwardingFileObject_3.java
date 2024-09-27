import javax.tools.ForwardingFileObject;
import javax.tools.FileObject;

import java.io.OutputStream;
import java.io.IOException;

public class ForwardingFileObject_3 {
    public static void main(String[] args) {
        ForwardingFileObject forwardingFileObject = new ForwardingFileObject() {
            @Override
            public OutputStream openOutputStream() throws IOException {
                // Implement your logic here
                return super.openOutputStream();
            }
        };
    }
}
