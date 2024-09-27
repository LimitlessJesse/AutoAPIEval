import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineManager_2 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        if (engine!= null) {
            System.out.println("Engine found and created successfully!");
        } else {
            System.out.println("Engine not found or creation failed.");
        }
    }
}
