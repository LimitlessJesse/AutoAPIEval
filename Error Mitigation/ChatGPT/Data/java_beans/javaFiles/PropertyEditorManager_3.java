import java.beans.PropertyEditorManager;

public class PropertyEditorManager_3 {
    public static void main(String[] args) {
        String[] path = {"com.example.editors", "com.example.customeditors"};
        PropertyEditorManager.setEditorSearchPath(path);
    }
}
