import java.beans.PropertyEditorManager;

public class PropertyEditorManager_5 {
    public static void main(String[] args) {
        String[] searchPath = PropertyEditorManager.getEditorSearchPath();
        
        System.out.println("Editor search path:");
        for (String path : searchPath) {
            System.out.println(path);
        }
    }
}
