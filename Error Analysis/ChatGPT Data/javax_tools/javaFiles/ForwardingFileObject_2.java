import javax.tools.ForwardingFileObject;
import javax.tools.JavaFileObject;
import java.io.OutputStream;
import java.io.IOException;

public class ForwardingFileObject_2 {
    public static void main(String[] args) {
        
    }
    
    public void useOpenOutputStream(ForwardingFileObject file) {
        try {
            JavaFileObject underlyingFile = file.getWrappedObject();
            OutputStream outputStream = file.openOutputStream();
            
            // Use the outputStream for writing to the file
            
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
