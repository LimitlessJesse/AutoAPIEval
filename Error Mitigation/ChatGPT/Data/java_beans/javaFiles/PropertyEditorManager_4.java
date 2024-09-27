import java.beans.PropertyEditorManager;

public class PropertyEditorManager_4 {
    public static void main(String[] args) {
        String[] searchPath = PropertyEditorManager.getEditorSearchPath();
        for (String path : searchPath) {
            System.out.println(path);
        }
    }
}
