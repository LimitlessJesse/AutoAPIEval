import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;

public class ForwardingJavaFileManager_1 {
    public static void main(String[] args) {
        
    }
    
    static class CustomJavaFileManager extends ForwardingJavaFileManager<JavaFileManager> {
        
        public CustomJavaFileManager(JavaFileManager fileManager) {
            super(fileManager);
        }
        
        @Override
        public void close() {
            // Custom implementation when closing the file manager
            super.close();
        }
    }
}
